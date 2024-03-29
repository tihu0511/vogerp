/* null */
/* auto generated constructor */
function org_shaolin_vogerp_productmodel_form_ProductCostTable(json)
{
    var prefix = (typeof(json) == "string") ? json : json.prefix; 
    var parentIdUI = new UIMaster.ui.hidden
    ({
        ui: elementList[prefix + "parentIdUI"]
    });

    var itemTable = new UIMaster.ui.objectlist
    ({
        ui: elementList[prefix + "itemTable"]
        ,editable: true
    });

    var priceUILabel = new UIMaster.ui.label
    ({
        ui: elementList[prefix + "priceUILabel"]
    });

    var priceUI = new UIMaster.ui.textfield
    ({
        ui: elementList[prefix + "priceUI"]
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

    var statisticPanel = new UIMaster.ui.panel
    ({
        ui: elementList[prefix + "statisticPanel"]
        ,items: []
        ,subComponents: [prefix + "priceUILabel",prefix + "priceUI"]
    });

    var fieldPanel = new UIMaster.ui.panel
    ({
        ui: elementList[prefix + "fieldPanel"]
        ,items: []
        ,subComponents: [prefix + "parentIdUI",prefix + "itemTable",prefix + "statisticPanel"]
    });

    var Form = new UIMaster.ui.panel
    ({
        ui: elementList[prefix + "Form"]
        ,items: [parentIdUI,itemTable,priceUILabel,priceUI,okbtn,cancelbtn,fieldPanel,statisticPanel,actionPanel]
    });

    Form.parentIdUI=parentIdUI;

    Form.itemTable=itemTable;

    Form.priceUILabel=priceUILabel;

    Form.priceUI=priceUI;

    Form.okbtn=okbtn;

    Form.cancelbtn=cancelbtn;

    Form.fieldPanel=fieldPanel;

    Form.statisticPanel=statisticPanel;

    Form.actionPanel=actionPanel;

    Form.user_constructor = function()
    {
        /* Construct_FIRST:org_shaolin_vogerp_productmodel_form_ProductCostTable */
        /* Construct_LAST:org_shaolin_vogerp_productmodel_form_ProductCostTable */
    };

    Form.createItem = org_shaolin_vogerp_productmodel_form_ProductCostTable_createItem;

    Form.deleteItem = org_shaolin_vogerp_productmodel_form_ProductCostTable_deleteItem;

    Form.Save = org_shaolin_vogerp_productmodel_form_ProductCostTable_Save;

    Form.Cancel = org_shaolin_vogerp_productmodel_form_ProductCostTable_Cancel;

    Form.__entityName="org.shaolin.vogerp.productmodel.form.ProductCostTable";

    Form.init();
    return Form;
};

    /* EventHandler Functions */
/* Other_Func_FIRST:org_shaolin_vogerp_productmodel_form_ProductCostTable */
/* Other_Func_LAST:org_shaolin_vogerp_productmodel_form_ProductCostTable */

    /* auto generated eventlistener function declaration */
    function org_shaolin_vogerp_productmodel_form_ProductCostTable_createItem(eventsource,event) {/* Gen_First:org_shaolin_vogerp_productmodel_form_ProductCostTable_createItem */

        // cal ajax function. 

        UIMaster.triggerServerEvent(UIMaster.getUIID(eventsource),"createItem_2000691788",UIMaster.getValue(eventsource),this.__entityName);

        var UIEntity = this;
    }/* Gen_Last:org_shaolin_vogerp_productmodel_form_ProductCostTable_createItem */


    /* auto generated eventlistener function declaration */
    function org_shaolin_vogerp_productmodel_form_ProductCostTable_deleteItem(eventsource,event) {/* Gen_First:org_shaolin_vogerp_productmodel_form_ProductCostTable_deleteItem */

        // cal ajax function. 

        UIMaster.triggerServerEvent(UIMaster.getUIID(eventsource),"deleteItem_-370544464",UIMaster.getValue(eventsource),this.__entityName);

        var UIEntity = this;
    }/* Gen_Last:org_shaolin_vogerp_productmodel_form_ProductCostTable_deleteItem */


    /* auto generated eventlistener function declaration */
    function org_shaolin_vogerp_productmodel_form_ProductCostTable_Save(eventsource,event) {/* Gen_First:org_shaolin_vogerp_productmodel_form_ProductCostTable_Save */

        {
            this.itemTable.syncBodyDataToServer();
        }
        
        // cal ajax function. 

        UIMaster.triggerServerEvent(UIMaster.getUIID(eventsource),"saveItem_-928911727",UIMaster.getValue(eventsource),this.__entityName);

        var UIEntity = this;
    }/* Gen_Last:org_shaolin_vogerp_productmodel_form_ProductCostTable_Save */


    /* auto generated eventlistener function declaration */
    function org_shaolin_vogerp_productmodel_form_ProductCostTable_Cancel(eventsource,event) {/* Gen_First:org_shaolin_vogerp_productmodel_form_ProductCostTable_Cancel */

        // cal ajax function. 

        UIMaster.triggerServerEvent(UIMaster.getUIID(eventsource),"cancelDetail40036941",UIMaster.getValue(eventsource),this.__entityName);

        var UIEntity = this;
    }/* Gen_Last:org_shaolin_vogerp_productmodel_form_ProductCostTable_Cancel */



