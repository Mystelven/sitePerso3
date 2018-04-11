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
