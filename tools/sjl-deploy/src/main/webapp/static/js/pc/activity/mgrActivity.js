/**
 * Created by luowen on 2017/3/4.
 */

(function () {
    "use strict"

    var E_putdown = $(".js-putdown");
    var E_recommend = $(".js-recommend");

    E_putdown.on("click", function () {
        var that = $(this);
        var id = that.data("id")
        alert(id)
    });

    E_recommend.on("click", function () {
        var that = $(this);
        var id = that.data("id")
        alert("recommend" + id);
    })


})();

