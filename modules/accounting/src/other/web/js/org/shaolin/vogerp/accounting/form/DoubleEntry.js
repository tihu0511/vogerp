/* null */
/* auto generated constructor */
function org_shaolin_vogerp_accounting_form_DoubleEntry(json)
{
    var prefix = (typeof(json) == "string") ? json : json.prefix; 
    var idUI = new UIMaster.ui.hidden
    ({
        ui: elementList[prefix + "idUI"]
    });

    var commentUILabel = new UIMaster.ui.label
    ({
        ui: elementList[prefix + "commentUILabel"]
    });

    var commentUI = new UIMaster.ui.textfield
    ({
        ui: elementList[prefix + "commentUI"]
    });

    var generalLedgerUILabel = new UIMaster.ui.label
    ({
        ui: elementList[prefix + "generalLedgerUILabel"]
    });

    var generalLedgerUI = new UIMaster.ui.combobox
    ({
        ui: elementList[prefix + "generalLedgerUI"]
    });

    var subLedgerUILabel = new UIMaster.ui.label
    ({
        ui: elementList[prefix + "subLedgerUILabel"]
    });

    var subLedgerUI = new UIMaster.ui.textfield
    ({
        ui: elementList[prefix + "subLedgerUI"]
    });

    var debitAmountUILabel = new UIMaster.ui.label
    ({
        ui: elementList[prefix + "debitAmountUILabel"]
    });

    var debitAmountUI = new UIMaster.ui.textfield
    ({
        ui: elementList[prefix + "debitAmountUI"]
    });

    var creditAmountUILabel = new UIMaster.ui.label
    ({
        ui: elementList[prefix + "creditAmountUILabel"]
    });

    var creditAmountUI = new UIMaster.ui.textfield
    ({
        ui: elementList[prefix + "creditAmountUI"]
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
        ,subComponents: [prefix + "idUI",prefix + "commentUILabel",prefix + "commentUI",prefix + "generalLedgerUILabel",prefix + "generalLedgerUI",prefix + "subLedgerUILabel",prefix + "subLedgerUI",prefix + "debitAmountUILabel",prefix + "debitAmountUI",prefix + "creditAmountUILabel",prefix + "creditAmountUI"]
    });

    var Form = new UIMaster.ui.panel
    ({
        ui: elementList[prefix + "Form"]
        ,items: [idUI,commentUILabel,commentUI,generalLedgerUILabel,generalLedgerUI,subLedgerUILabel,subLedgerUI,debitAmountUILabel,debitAmountUI,creditAmountUILabel,creditAmountUI,okbtn,cancelbtn,fieldPanel,actionPanel]
    });

    Form.idUI=idUI;

    Form.commentUILabel=commentUILabel;

    Form.commentUI=commentUI;

    Form.generalLedgerUILabel=generalLedgerUILabel;

    Form.generalLedgerUI=generalLedgerUI;

    Form.subLedgerUILabel=subLedgerUILabel;

    Form.subLedgerUI=subLedgerUI;

    Form.debitAmountUILabel=debitAmountUILabel;

    Form.debitAmountUI=debitAmountUI;

    Form.creditAmountUILabel=creditAmountUILabel;

    Form.creditAmountUI=creditAmountUI;

    Form.okbtn=okbtn;

    Form.cancelbtn=cancelbtn;

    Form.fieldPanel=fieldPanel;

    Form.idUI=idUI;

    Form.commentUILabel=commentUILabel;

    Form.commentUI=commentUI;

    Form.generalLedgerUILabel=generalLedgerUILabel;

    Form.generalLedgerUI=generalLedgerUI;

    Form.subLedgerUILabel=subLedgerUILabel;

    Form.subLedgerUI=subLedgerUI;

    Form.debitAmountUILabel=debitAmountUILabel;

    Form.debitAmountUI=debitAmountUI;

    Form.creditAmountUILabel=creditAmountUILabel;

    Form.creditAmountUI=creditAmountUI;

    Form.actionPanel=actionPanel;

    Form.okbtn=okbtn;

    Form.cancelbtn=cancelbtn;

    Form.user_constructor = function()
    {
        /* Construct_FIRST:org_shaolin_vogerp_accounting_form_DoubleEntry */
        /* Construct_LAST:org_shaolin_vogerp_accounting_form_DoubleEntry */
    };

    Form.Save = org_shaolin_vogerp_accounting_form_DoubleEntry_Save;

    Form.Cancel = org_shaolin_vogerp_accounting_form_DoubleEntry_Cancel;

    Form.invokeDynamicFunction = org_shaolin_vogerp_accounting_form_DoubleEntry_invokeDynamicFunction;

    Form.__entityName="org.shaolin.vogerp.accounting.form.DoubleEntry";

    Form.init();
    return Form;
};

    /* EventHandler Functions */
/* Other_Func_FIRST:org_shaolin_vogerp_accounting_form_DoubleEntry */
/* Other_Func_LAST:org_shaolin_vogerp_accounting_form_DoubleEntry */

    /* auto generated eventlistener function declaration */
    function org_shaolin_vogerp_accounting_form_DoubleEntry_Save(eventsource,event) {/* Gen_First:org_shaolin_vogerp_accounting_form_DoubleEntry_Save */

        // cal ajax function. 

        UIMaster.triggerServerEvent(UIMaster.getUIID(eventsource),"saveDetail-20150904-084549",UIMaster.getValue(eventsource),this.__entityName);

        var UIEntity = this;
    }/* Gen_Last:org_shaolin_vogerp_accounting_form_DoubleEntry_Save */


    /* auto generated eventlistener function declaration */
    function org_shaolin_vogerp_accounting_form_DoubleEntry_Cancel(eventsource,event) {/* Gen_First:org_shaolin_vogerp_accounting_form_DoubleEntry_Cancel */

        // cal ajax function. 

        UIMaster.triggerServerEvent(UIMaster.getUIID(eventsource),"cancelDetail-20150904-084549",UIMaster.getValue(eventsource),this.__entityName);

        var UIEntity = this;
    }/* Gen_Last:org_shaolin_vogerp_accounting_form_DoubleEntry_Cancel */


    /* auto generated eventlistener function declaration */
    function org_shaolin_vogerp_accounting_form_DoubleEntry_invokeDynamicFunction(eventsource,event) {/* Gen_First:org_shaolin_vogerp_accounting_form_DoubleEntry_invokeDynamicFunction */

        // cal ajax function. 

        UIMaster.triggerServerEvent(UIMaster.getUIID(eventsource),event,UIMaster.getValue(eventsource),this.__entityName);

        var UIEntity = this;
    }/* Gen_Last:org_shaolin_vogerp_accounting_form_DoubleEntry_invokeDynamicFunction */



