/**
 * Created by luowen on 2017/2/28.
 */

(function(){
    "use strict";
    var E_submit = $(".js-submit");
    var E_name = $("#js-industry-name")
    var E_id = $("#js-industry-id");

    E_submit.on("click", function () {
        var V_name = E_name.val();
        var V_id = E_id.val();
        if(V_name == "" || V_id == "") {
            E_name.focus(); return false;
        }
        httpUtils.post("/activity/industry/update/" + V_id, {id: V_id, name: V_name}).then(function (response) {
            if(response.code === 0) {
                alert(response.msg);
            } else {
                alert(response.msg);
            }
        });
    });
})();
