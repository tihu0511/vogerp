/* null */
/* auto generated constructor */
function org_shaolin_vogerp_commonmodel_form_OrganizationTreeEditor(json)
{
    var prefix = (typeof(json) == "string") ? json : json.prefix; 
    var organizationTree = new UIMaster.ui.webtree
    ({
        ui: elementList[prefix + "organizationTree"]
    });

    var detailPanel = new UIMaster.ui.panel
    ({
        ui: elementList[prefix + "detailPanel"]
        ,uiskin: "org.shaolin.uimaster.page.skin.TitlePanel"
        ,items: []
        ,subComponents: []
    });

    var treePanel = new UIMaster.ui.panel
    ({
        ui: elementList[prefix + "treePanel"]
        ,items: []
        ,subComponents: [prefix + "organizationTree"]
    });

    var rootPanel = new UIMaster.ui.panel
    ({
        ui: elementList[prefix + "rootPanel"]
        ,items: []
        ,subComponents: [prefix + "treePanel",prefix + "detailPanel"]
    });

    var Form = new UIMaster.ui.panel
    ({
        ui: elementList[prefix + "Form"]
        ,items: [organizationTree,rootPanel,treePanel,detailPanel]
    });

    Form.organizationTree=organizationTree;

    Form.rootPanel=rootPanel;

    Form.treePanel=treePanel;

    Form.organizationTree=organizationTree;

    Form.detailPanel=detailPanel;

    Form.treePanel=treePanel;

    Form.organizationTree=organizationTree;

    Form.detailPanel=detailPanel;

    Form.user_constructor = function()
    {
        /* Construct_FIRST:org_shaolin_vogerp_commonmodel_form_OrganizationTreeEditor */
        /* Construct_LAST:org_shaolin_vogerp_commonmodel_form_OrganizationTreeEditor */
    };

    Form.clickTreeNode = org_shaolin_vogerp_commonmodel_form_OrganizationTreeEditor_clickTreeNode;

    Form.createSubOrg = org_shaolin_vogerp_commonmodel_form_OrganizationTreeEditor_createSubOrg;

    Form.expandTree = org_shaolin_vogerp_commonmodel_form_OrganizationTreeEditor_expandTree;

    Form.deleteNode = org_shaolin_vogerp_commonmodel_form_OrganizationTreeEditor_deleteNode;

    Form.Cancel = org_shaolin_vogerp_commonmodel_form_OrganizationTreeEditor_Cancel;

    Form.invokeDynamicFunction = org_shaolin_vogerp_commonmodel_form_OrganizationTreeEditor_invokeDynamicFunction;

    Form.__entityName="org.shaolin.vogerp.commonmodel.form.OrganizationTreeEditor";

    Form.init();
    return Form;
};

    /* EventHandler Functions */
/* Other_Func_FIRST:org_shaolin_vogerp_commonmodel_form_OrganizationTreeEditor */
/* Other_Func_LAST:org_shaolin_vogerp_commonmodel_form_OrganizationTreeEditor */

    /* auto generated eventlistener function declaration */
    function org_shaolin_vogerp_commonmodel_form_OrganizationTreeEditor_clickTreeNode(eventsource,event) {/* Gen_First:org_shaolin_vogerp_commonmodel_form_OrganizationTreeEditor_clickTreeNode */

        // cal ajax function. 

        UIMaster.triggerServerEvent(UIMaster.getUIID(eventsource),"showSubOrgInfoPanel",UIMaster.getValue(eventsource),this.__entityName);

        {   
            $(elementList["organizationTreeForm.detailPanel"]).css("height","270px");
            $(elementList["organizationTreeForm.newOrgForm.okbtn"]).addClass("ui-button ui-widget ui-state-default ui-corner-all ui-button-text-only");
            $(elementList["organizationTreeForm.newOrgForm.cancelbtn"]).addClass("ui-button ui-widget ui-state-default ui-corner-all ui-button-text-only");
            $(elementList["organizationTreeForm.newOrgForm.okbtn"]).parent().css("text-align","right");
            $(elementList["organizationTreeForm.newOrgForm.cancelbtn"]).parent().css("text-align","right");
        }
        
        var UIEntity = this;
    }/* Gen_Last:org_shaolin_vogerp_commonmodel_form_OrganizationTreeEditor_clickTreeNode */


    /* auto generated eventlistener function declaration */
    function org_shaolin_vogerp_commonmodel_form_OrganizationTreeEditor_createSubOrg(eventsource,event) {/* Gen_First:org_shaolin_vogerp_commonmodel_form_OrganizationTreeEditor_createSubOrg */

        // cal ajax function. 

        UIMaster.triggerServerEvent(UIMaster.getUIID(eventsource),"createSubOrgInfoPanel",UIMaster.getValue(eventsource),this.__entityName);

        var UIEntity = this;
    }/* Gen_Last:org_shaolin_vogerp_commonmodel_form_OrganizationTreeEditor_createSubOrg */


    /* auto generated eventlistener function declaration */
    function org_shaolin_vogerp_commonmodel_form_OrganizationTreeEditor_expandTree(eventsource,event) {/* Gen_First:org_shaolin_vogerp_commonmodel_form_OrganizationTreeEditor_expandTree */

        // cal ajax function. 

        UIMaster.triggerServerEvent(UIMaster.getUIID(eventsource),"expandTreeNode",UIMaster.getValue(eventsource),this.__entityName);

        var UIEntity = this;
    }/* Gen_Last:org_shaolin_vogerp_commonmodel_form_OrganizationTreeEditor_expandTree */


    /* auto generated eventlistener function declaration */
    function org_shaolin_vogerp_commonmodel_form_OrganizationTreeEditor_deleteNode(eventsource,event) {/* Gen_First:org_shaolin_vogerp_commonmodel_form_OrganizationTreeEditor_deleteNode */

        // cal ajax function. 

        UIMaster.triggerServerEvent(UIMaster.getUIID(eventsource),"deleteTreeNode",UIMaster.getValue(eventsource),this.__entityName);

        var UIEntity = this;
    }/* Gen_Last:org_shaolin_vogerp_commonmodel_form_OrganizationTreeEditor_deleteNode */


    /* auto generated eventlistener function declaration */
    function org_shaolin_vogerp_commonmodel_form_OrganizationTreeEditor_Cancel(eventsource,event) {/* Gen_First:org_shaolin_vogerp_commonmodel_form_OrganizationTreeEditor_Cancel */

        // cal ajax function. 

        UIMaster.triggerServerEvent(UIMaster.getUIID(eventsource),"cancelDetail-1509902581",UIMaster.getValue(eventsource),this.__entityName);

        var UIEntity = this;
    }/* Gen_Last:org_shaolin_vogerp_commonmodel_form_OrganizationTreeEditor_Cancel */


    /* auto generated eventlistener function declaration */
    function org_shaolin_vogerp_commonmodel_form_OrganizationTreeEditor_invokeDynamicFunction(eventsource,event) {/* Gen_First:org_shaolin_vogerp_commonmodel_form_OrganizationTreeEditor_invokeDynamicFunction */

        // cal ajax function. 

        UIMaster.triggerServerEvent(UIMaster.getUIID(eventsource),event,UIMaster.getValue(eventsource),this.__entityName);

        var UIEntity = this;
    }/* Gen_Last:org_shaolin_vogerp_commonmodel_form_OrganizationTreeEditor_invokeDynamicFunction */



