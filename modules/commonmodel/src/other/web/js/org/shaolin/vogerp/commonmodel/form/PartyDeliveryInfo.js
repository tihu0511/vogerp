/* null */
/* auto generated constructor */
function org_shaolin_vogerp_commonmodel_form_PartyDeliveryInfo(json)
{
    var prefix = (typeof(json) == "string") ? json : json.prefix; 
    var addressUI = new UIMaster.ui.combobox
    ({
        ui: elementList[prefix + "addressUI"]
      ,allowBlank:false
    });

    var contactUI = new UIMaster.ui.combobox
    ({
        ui: elementList[prefix + "contactUI"]
      ,allowBlank:false
    });

    var fieldPanel = new UIMaster.ui.panel
    ({
        ui: elementList[prefix + "fieldPanel"]
        ,items: []
        ,subComponents: [prefix + "addressUI",prefix + "contactUI"]
    });

    var Form = new UIMaster.ui.panel
    ({
        ui: elementList[prefix + "Form"]
        ,items: [addressUI,contactUI,fieldPanel]
    });

    Form.addressUI=addressUI;

    Form.contactUI=contactUI;

    Form.fieldPanel=fieldPanel;

    Form.user_constructor = function()
    {
        /* Construct_FIRST:org_shaolin_vogerp_commonmodel_form_PartyDeliveryInfo */
        /* Construct_LAST:org_shaolin_vogerp_commonmodel_form_PartyDeliveryInfo */
    };

    Form.__entityName="org.shaolin.vogerp.commonmodel.form.PartyDeliveryInfo";

    Form.init();
    return Form;
};

    /* EventHandler Functions */
/* Other_Func_FIRST:org_shaolin_vogerp_commonmodel_form_PartyDeliveryInfo */
/* Other_Func_LAST:org_shaolin_vogerp_commonmodel_form_PartyDeliveryInfo */

