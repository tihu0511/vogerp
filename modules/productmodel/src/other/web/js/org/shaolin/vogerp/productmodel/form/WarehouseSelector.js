/* null */
/* auto generated constructor */
function org_shaolin_vogerp_productmodel_form_WarehouseSelector(json)
{
    var prefix = (typeof(json) == "string") ? json : json.prefix; 
    var selectProductNodeUI = new UIMaster.ui.hidden
    ({
        ui: elementList[prefix + "selectProductNodeUI"]
    });

    var productTree = new UIMaster.ui.webtree
    ({
        ui: elementList[prefix + "productTree"]
    });

    var fieldPanel = new UIMaster.ui.panel
    ({
        ui: elementList[prefix + "fieldPanel"]
        ,items: []
        ,subComponents: [prefix + "selectProductNodeUI",prefix + "productTree"]
    });

    var Form = new UIMaster.ui.panel
    ({
        ui: elementList[prefix + "Form"]
        ,items: [selectProductNodeUI,productTree,fieldPanel]
    });

    Form.selectProductNodeUI=selectProductNodeUI;

    Form.productTree=productTree;

    Form.fieldPanel=fieldPanel;

    Form.selectProductNodeUI=selectProductNodeUI;

    Form.productTree=productTree;

    Form.user_constructor = function()
    {
        /* Construct_FIRST:org_shaolin_vogerp_productmodel_form_WarehouseSelector */
        /* Construct_LAST:org_shaolin_vogerp_productmodel_form_WarehouseSelector */
    };

    Form.SelectProduct = org_shaolin_vogerp_productmodel_form_WarehouseSelector_SelectProduct;

    Form.expandTreeNode = org_shaolin_vogerp_productmodel_form_WarehouseSelector_expandTreeNode;

    Form.invokeDynamicFunction = org_shaolin_vogerp_productmodel_form_WarehouseSelector_invokeDynamicFunction;

    Form.__entityName="org.shaolin.vogerp.productmodel.form.WarehouseSelector";

    Form.init();
    return Form;
};

    /* EventHandler Functions */
/* Other_Func_FIRST:org_shaolin_vogerp_productmodel_form_WarehouseSelector */
/* Other_Func_LAST:org_shaolin_vogerp_productmodel_form_WarehouseSelector */

    /* auto generated eventlistener function declaration */
    function org_shaolin_vogerp_productmodel_form_WarehouseSelector_SelectProduct(eventsource,event) {/* Gen_First:org_shaolin_vogerp_productmodel_form_WarehouseSelector_SelectProduct */

        // cal ajax function. 

        UIMaster.triggerServerEvent(UIMaster.getUIID(eventsource),"SelectProduct_20250604847",UIMaster.getValue(eventsource),this.__entityName);

        var UIEntity = this;
    }/* Gen_Last:org_shaolin_vogerp_productmodel_form_WarehouseSelector_SelectProduct */


    /* auto generated eventlistener function declaration */
    function org_shaolin_vogerp_productmodel_form_WarehouseSelector_expandTreeNode(eventsource,event) {/* Gen_First:org_shaolin_vogerp_productmodel_form_WarehouseSelector_expandTreeNode */

        // cal ajax function. 

        UIMaster.triggerServerEvent(UIMaster.getUIID(eventsource),"expandTreeNode_2040990210",UIMaster.getValue(eventsource),this.__entityName);

        var UIEntity = this;
    }/* Gen_Last:org_shaolin_vogerp_productmodel_form_WarehouseSelector_expandTreeNode */


    /* auto generated eventlistener function declaration */
    function org_shaolin_vogerp_productmodel_form_WarehouseSelector_invokeDynamicFunction(eventsource,event) {/* Gen_First:org_shaolin_vogerp_productmodel_form_WarehouseSelector_invokeDynamicFunction */

        // cal ajax function. 

        UIMaster.triggerServerEvent(UIMaster.getUIID(eventsource),event,UIMaster.getValue(eventsource),this.__entityName);

        var UIEntity = this;
    }/* Gen_Last:org_shaolin_vogerp_productmodel_form_WarehouseSelector_invokeDynamicFunction */



