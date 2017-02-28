/**
 * Created by luowen on 2017/2/28.
 */

(function(){
    "use strict";
    var E_delete = $(".js-industry-delete");

    E_delete.on("click", function () {
        var that = $(this);
        var id = that.data("id");
        httpUtils.post("/activity/industry/delete/"+id).then(function (response) {
            if(response.code === 0) {
                alert(response.msg);
                window.location.reload(true);
            } else {
                alert(response.msg);
            }
        });
    })
})();
