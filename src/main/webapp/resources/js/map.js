var locations = [
    ['Centre de Recherche en Informatique de Lens', 50.4342336,2.823379, 2],
    ['Home in Łódź', 51.8182257,19.4260382, 1]
];

var locations_tmp = [
    ['IJCAR\'16', 40.2089072,-8.4263396, 3],
    ['SAT\'16', 44.808375,-0.596705, 4]
];

var map;
var markers = [];

function init() {

    map = new google.maps.Map(document.getElementById('map_canvas'), {
        zoom: 4,
        center: new google.maps.LatLng(47.261625,7.288708),
        mapTypeId: google.maps.MapTypeId.ROADMAP
    });

    var num_markers = locations.length;

    for (var i = 0; i < num_markers; i++) {

        markers[i] = new google.maps.Marker({
            position: {lat:locations[i][1], lng:locations[i][2]},
            map: map,
            icon: "http://maps.google.com/mapfiles/ms/icons/red-dot.png",
            html: locations[i][0],
            id: i,
        });

        google.maps.event.addListener(markers[i], 'click', function() {

            var infowindow = new google.maps.InfoWindow({
                id: this.id,
                content:this.html,
                position:this.getPosition()
            });

            google.maps.event.addListenerOnce(infowindow, 'closeclick', function() {
                markers[this.id].setVisible(true);
            });

            infowindow.open(map);
        });
    }

    var num_markers = locations_tmp.length;

    for (var i = 0; i < num_markers; i++) {

            markers[i] = new google.maps.Marker({
                position: {lat:locations_tmp[i][1], lng:locations_tmp[i][2]},
                map: map,
                icon: "http://maps.google.com/mapfiles/ms/icons/blue-dot.png",
                html: locations_tmp[i][0],
                id: i,
            });

            google.maps.event.addListener(markers[i], 'click', function() {

                var infowindow = new google.maps.InfoWindow({
                    id: this.id,
                    content:this.html,
                    position:this.getPosition()
                });

                google.maps.event.addListenerOnce(infowindow, 'closeclick', function() {
                    markers[this.id].setVisible(true);
                });

                infowindow.open(map);
            });
        }
}