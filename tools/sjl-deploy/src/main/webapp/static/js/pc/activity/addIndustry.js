/**
 * Created by luowen on 2017/2/28.
 */

(function(){
    "use strict";
    var E_submit = $(".js-submit");
    var E_form = $("#js-form");
    var E_name = $("#js-industry-name");
    var E_cancel = $(".js-cancel");

    E_cancel.on("click", function () {
        E_name.val("")
    });
    E_submit.on("click", function () {
        var V_data = E_form.serialize();
        var V_name = E_name.val();

        if(V_name == "") {
            E_name.focus(); return false;
        }
        httpUtils.post("/activity/industry/create", V_data).then(function (response) {
            if(response.code === 0) {
                alert(response.msg);
                E_name.val("")
            } else {
                alert(response.msg);
            }
        });
    });
})();
