$(document).ready( function() {

function animMeter() {
    $(".meter > span").each(function() {
                $(this)
                    .data("origWidth", $(this).width())
                    .width(0)
                    .animate({
                        width: $(this).data("origWidth")
                    }, 1800);
            });
}

animMeter();

});


jQuery(function($) {
    // Asynchronously Load the map API
    var script = document.createElement('script');
    script.src = "http://maps.googleapis.com/maps/api/js?sensor=false&callback=initialize";
    document.body.appendChild(script);
});

function initialize() {
    var map;
    var bounds = new google.maps.LatLngBounds();
    var mapOptions = {
        mapTypeId: 'roadmap'
    };

    // Display a map on the page
    map = new google.maps.Map(document.getElementById("map_canvas"), mapOptions);
    map.setTilt(45);

    // Multiple Markers
    var markers = [
        ["Ecole Polytechnique de l'Université de Tours", 47.364692,0.684746],
        ["Atos IT Solutions and Services Wrocław", 51.125317,16.977176],
        ["Politechnika Łódzka", 51.753715,19.451718],
        ["Axa Assistance Canada Montreal", 45.504358,-73.572,17],
        ["Université du Québec à Montréal",45.5134098,-73.5638682],
        ["Centre de Recherche en Informatique de Lens",50.434072,2.8237282],
    ];

    // Info Window Content
    var infoWindowContent = [

        ['<div class="info_content">' +
        "<h3>Ecole Polytechnique de l'Université de Tours</h3>" +
        "<p>I've done here my engineer degree in Computer Science.</p>" +
        '</div>'],

        ['<div class="info_content">' + '<h3>Atos Wrocław</h3>' +
         '<p>I\'ve done my internship from may 2015 to the end of september 2015.</p>' +
         '</div>'],

         ['<div class="info_content">' + '<h3>Politechnika Łódzka</h3>' +
          '<p>I spent there the 2014 winter semester in Erasmus.</p>' +
          '</div>'],

        ['<div class="info_content">' + '<h3>Axa Assistance Canada</h3>' +
        '<p>I\'ve done my internship from april 2012 to the end of august 2012.</p>' +
        '</div>'],

        ['<div class="info_content">' + '<h3>Université du Québec à Montréal</h3>' +
                '<p>I spent there the 2012 winter semester in Mundus.</p>' +
        '</div>'],

        ['<div class="info_content">' + '<h3>Centre de Recherche en Informatique de Lens</h3>' +
                    '<p>I will spend my Ph.D in Artificial Intelligence here (2015 - 2018).</p>' +
        '</div>'],

    ];

    // Display multiple markers on a map
    var infoWindow = new google.maps.InfoWindow(), marker, i;

    // Loop through our array of markers & place each one on the map
    for( i = 0; i < markers.length; i++ ) {
        var position = new google.maps.LatLng(markers[i][1], markers[i][2]);
        bounds.extend(position);
        marker = new google.maps.Marker({
            position: position,
            map: map,
            title: markers[i][0]
        });

        // Allow each marker to have an info window
        google.maps.event.addListener(marker, 'click', (function(marker, i) {
            return function() {
                infoWindow.setContent(infoWindowContent[i][0]);
                infoWindow.open(map, marker);
            }
        })(marker, i));

        // Automatically center the map fitting all markers on the screen
        map.fitBounds(bounds);
    }

    // Override our map zoom level once our fitBounds function runs (Make sure it only runs once)
    var boundsListener = google.maps.event.addListener((map), 'bounds_changed', function(event) {
        this.setZoom(3);
        google.maps.event.removeListener(boundsListener);
    });

}