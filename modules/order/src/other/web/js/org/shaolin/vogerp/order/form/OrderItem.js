/* null */
/* auto generated constructor */
function org_shaolin_vogerp_order_form_OrderItem(json)
{
    var prefix = (typeof(json) == "string") ? json : json.prefix; 
    var idUI = new UIMaster.ui.hidden
    ({
        ui: elementList[prefix + "idUI"]
    });

    var productIdUILabel = new UIMaster.ui.label
    ({
        ui: elementList[prefix + "productIdUILabel"]
    });

    var productIdUI = new UIMaster.ui.textfield
    ({
        ui: elementList[prefix + "productIdUI"]
    });

    var amountUILabel = new UIMaster.ui.label
    ({
        ui: elementList[prefix + "amountUILabel"]
    });

    var amountUI = new UIMaster.ui.textfield
    ({
        ui: elementList[prefix + "amountUI"]
    });

    var unitPriceUILabel = new UIMaster.ui.label
    ({
        ui: elementList[prefix + "unitPriceUILabel"]
    });

    var unitPriceUI = new UIMaster.ui.textfield
    ({
        ui: elementList[prefix + "unitPriceUI"]
    });

    var ajustPriceTypeUILabel = new UIMaster.ui.label
    ({
        ui: elementList[prefix + "ajustPriceTypeUILabel"]
    });

    var ajustPriceTypeUI = new UIMaster.ui.combobox
    ({
        ui: elementList[prefix + "ajustPriceTypeUI"]
    });

    var ajustPriceUILabel = new UIMaster.ui.label
    ({
        ui: elementList[prefix + "ajustPriceUILabel"]
    });

    var ajustPriceUI = new UIMaster.ui.textfield
    ({
        ui: elementList[prefix + "ajustPriceUI"]
    });

    var commentUILabel = new UIMaster.ui.label
    ({
        ui: elementList[prefix + "commentUILabel"]
    });

    var commentUI = new UIMaster.ui.textfield
    ({
        ui: elementList[prefix + "commentUI"]
    });

    var termsUILabel = new UIMaster.ui.label
    ({
        ui: elementList[prefix + "termsUILabel"]
    });

    var termsUI = new UIMaster.ui.combobox
    ({
        ui: elementList[prefix + "termsUI"]
    });

    var okbtn = new UIMaster.ui.button
    ({
        ui: elementList[prefix + "okbtn"]
    });

    var cancelbtn = new UIMaster.ui.button
    ({
        ui: elementList[prefix + "cancelbtn"]
    });

    var actionPanel = new UIMaster.ui.panel
    ({
        ui: elementList[prefix + "actionPanel"]
        ,items: []
        ,subComponents: [prefix + "okbtn",prefix + "cancelbtn"]
    });

    var fieldPanel = new UIMaster.ui.panel
    ({
        ui: elementList[prefix + "fieldPanel"]
        ,items: []
        ,subComponents: [prefix + "idUI",prefix + "productIdUILabel",prefix + "productIdUI",prefix + "amountUILabel",prefix + "amountUI",prefix + "unitPriceUILabel",prefix + "unitPriceUI",prefix + "ajustPriceTypeUILabel",prefix + "ajustPriceTypeUI",prefix + "ajustPriceUILabel",prefix + "ajustPriceUI",prefix + "commentUILabel",prefix + "commentUI",prefix + "termsUILabel",prefix + "termsUI"]
    });

    var Form = new UIMaster.ui.panel
    ({
        ui: elementList[prefix + "Form"]
        ,items: [idUI,productIdUILabel,productIdUI,amountUILabel,amountUI,unitPriceUILabel,unitPriceUI,ajustPriceTypeUILabel,ajustPriceTypeUI,ajustPriceUILabel,ajustPriceUI,commentUILabel,commentUI,termsUILabel,termsUI,okbtn,cancelbtn,fieldPanel,actionPanel]
    });

    Form.idUI=idUI;

    Form.productIdUILabel=productIdUILabel;

    Form.productIdUI=productIdUI;

    Form.amountUILabel=amountUILabel;

    Form.amountUI=amountUI;

    Form.unitPriceUILabel=unitPriceUILabel;

    Form.unitPriceUI=unitPriceUI;

    Form.ajustPriceTypeUILabel=ajustPriceTypeUILabel;

    Form.ajustPriceTypeUI=ajustPriceTypeUI;

    Form.ajustPriceUILabel=ajustPriceUILabel;

    Form.ajustPriceUI=ajustPriceUI;

    Form.commentUILabel=commentUILabel;

    Form.commentUI=commentUI;

    Form.termsUILabel=termsUILabel;

    Form.termsUI=termsUI;

    Form.okbtn=okbtn;

    Form.cancelbtn=cancelbtn;

    Form.fieldPanel=fieldPanel;

    Form.idUI=idUI;

    Form.productIdUILabel=productIdUILabel;

    Form.productIdUI=productIdUI;

    Form.amountUILabel=amountUILabel;

    Form.amountUI=amountUI;

    Form.unitPriceUILabel=unitPriceUILabel;

    Form.unitPriceUI=unitPriceUI;

    Form.ajustPriceTypeUILabel=ajustPriceTypeUILabel;

    Form.ajustPriceTypeUI=ajustPriceTypeUI;

    Form.ajustPriceUILabel=ajustPriceUILabel;

    Form.ajustPriceUI=ajustPriceUI;

    Form.commentUILabel=commentUILabel;

    Form.commentUI=commentUI;

    Form.termsUILabel=termsUILabel;

    Form.termsUI=termsUI;

    Form.actionPanel=actionPanel;

    Form.okbtn=okbtn;

    Form.cancelbtn=cancelbtn;

    Form.user_constructor = function()
    {
        /* Construct_FIRST:org_shaolin_vogerp_order_form_OrderItem */
        /* Construct_LAST:org_shaolin_vogerp_order_form_OrderItem */
    };

    Form.Save = org_shaolin_vogerp_order_form_OrderItem_Save;

    Form.Cancel = org_shaolin_vogerp_order_form_OrderItem_Cancel;

    Form.invokeDynamicFunction = org_shaolin_vogerp_order_form_OrderItem_invokeDynamicFunction;

    Form.__entityName="org.shaolin.vogerp.order.form.OrderItem";

    Form.init();
    return Form;
};

    /* EventHandler Functions */
/* Other_Func_FIRST:org_shaolin_vogerp_order_form_OrderItem */
/* Other_Func_LAST:org_shaolin_vogerp_order_form_OrderItem */

    /* auto generated eventlistener function declaration */
    function org_shaolin_vogerp_order_form_OrderItem_Save(eventsource,event) {/* Gen_First:org_shaolin_vogerp_order_form_OrderItem_Save */

        // cal ajax function. 

        UIMaster.triggerServerEvent(UIMaster.getUIID(eventsource),"saveDetail1087017690",UIMaster.getValue(eventsource),this.__entityName);

        var UIEntity = this;
    }/* Gen_Last:org_shaolin_vogerp_order_form_OrderItem_Save */


    /* auto generated eventlistener function declaration */
    function org_shaolin_vogerp_order_form_OrderItem_Cancel(eventsource,event) {/* Gen_First:org_shaolin_vogerp_order_form_OrderItem_Cancel */

        // cal ajax function. 

        UIMaster.triggerServerEvent(UIMaster.getUIID(eventsource),"cancelDetail-781675249",UIMaster.getValue(eventsource),this.__entityName);

        var UIEntity = this;
    }/* Gen_Last:org_shaolin_vogerp_order_form_OrderItem_Cancel */


    /* auto generated eventlistener function declaration */
    function org_shaolin_vogerp_order_form_OrderItem_invokeDynamicFunction(eventsource,event) {/* Gen_First:org_shaolin_vogerp_order_form_OrderItem_invokeDynamicFunction */

        // cal ajax function. 

        UIMaster.triggerServerEvent(UIMaster.getUIID(eventsource),event,UIMaster.getValue(eventsource),this.__entityName);

        var UIEntity = this;
    }/* Gen_Last:org_shaolin_vogerp_order_form_OrderItem_invokeDynamicFunction */



