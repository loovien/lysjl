/**
 * Created by luowen on 2017/3/4.
 */


(function () {
    "use strict";

    var E_form = $("#js-activity-form");
    var E_submit = $(".js-submit");

    E_submit.on("click", function(){
        var V_data = E_form.serialize();
        console.log(V_data);
        httpUtils.post("/activity/general", V_data).then(function(response){
            alert(response.msg);
        });
        return false;
    });

})();
