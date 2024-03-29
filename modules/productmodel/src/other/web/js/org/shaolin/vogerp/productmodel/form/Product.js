/* null */
/* auto generated constructor */
function org_shaolin_vogerp_productmodel_form_Product(json)
{
    var prefix = (typeof(json) == "string") ? json : json.prefix; 
    var funcsPanel = new UIMaster.ui.prenextpanel
    ({
        ui: elementList[prefix + "funcsPanel"]
        ,items: []
        ,subComponents: [prefix + "infoPanel0",prefix + "infoPanel3",prefix + "infoPanel1",prefix + "infoPanel2"]
    });
    var nameUILabel = new UIMaster.ui.label
    ({
        ui: elementList[prefix + "nameUILabel"]
    });

    var nameUI = new UIMaster.ui.textfield
    ({
        ui: elementList[prefix + "nameUI"]
    });

    var descriptionUILabel = new UIMaster.ui.label
    ({
        ui: elementList[prefix + "descriptionUILabel"]
    });

    var descriptionUI = new UIMaster.ui.textfield
    ({
        ui: elementList[prefix + "descriptionUI"]
    });

    var typeUILabel = new UIMaster.ui.label
    ({
        ui: elementList[prefix + "typeUILabel"]
    });

    var typeUI = new org_shaolin_vogerp_commonmodel_form_CEHierarchyWithCombox({"prefix":prefix + "typeUI."});

    var onSaleDateUILabel = new UIMaster.ui.label
    ({
        ui: elementList[prefix + "onSaleDateUILabel"]
    });

    var onSaleDateUI = new UIMaster.ui.calendar
    ({
        ui: elementList[prefix + "onSaleDateUI"]
    });

    var saleEndDateUILabel = new UIMaster.ui.label
    ({
        ui: elementList[prefix + "saleEndDateUILabel"]
    });

    var saleEndDateUI = new UIMaster.ui.calendar
    ({
        ui: elementList[prefix + "saleEndDateUI"]
    });

    var infoPanel0 = new UIMaster.ui.panel
    ({
        ui: elementList[prefix + "infoPanel0"]
        ,items: []
        ,subComponents: [prefix + "nameUILabel",prefix + "nameUI",prefix + "descriptionUILabel",prefix + "descriptionUI",prefix + "typeUILabel",prefix + "typeUI",prefix + "onSaleDateUILabel",prefix + "onSaleDateUI",prefix + "saleEndDateUILabel",prefix + "saleEndDateUI"]
    });
    var infoPanel3 = new org_shaolin_vogerp_productmodel_form_ProductCode({"prefix":prefix + "infoPanel3."});

    var photoPathUI = new UIMaster.ui.label
    ({
        ui: elementList[prefix + "photoPathUI"]
    });

    var photoUI = new UIMaster.ui.image
    ({
        ui: elementList[prefix + "photoUI"]
    });

    var photoUILabel = new UIMaster.ui.label
    ({
        ui: elementList[prefix + "photoUILabel"]
    });

    var uploadFile = new UIMaster.ui.file
    ({
        ui: elementList[prefix + "uploadFile"]
    });

    var infoPanel1 = new UIMaster.ui.panel
    ({
        ui: elementList[prefix + "infoPanel1"]
        ,items: []
        ,subComponents: [prefix + "photoPathUI",prefix + "photoUI",prefix + "photoUILabel",prefix + "uploadFile"]
    });
    var htmlDescUI = new UIMaster.ui.textarea
    ({
        ui: elementList[prefix + "htmlDescUI"]
    });

    var infoPanel2 = new UIMaster.ui.panel
    ({
        ui: elementList[prefix + "infoPanel2"]
        ,items: []
        ,subComponents: [prefix + "htmlDescUI"]
    });

    var okbtn = new UIMaster.ui.button
    ({
        ui: elementList[prefix + "okbtn"]
    });

    var actionPanel = new UIMaster.ui.panel
    ({
        ui: elementList[prefix + "actionPanel"]
        ,items: []
        ,subComponents: [prefix + "okbtn"]
    });

    var fieldPanel = new UIMaster.ui.panel
    ({
        ui: elementList[prefix + "fieldPanel"]
        ,items: []
        ,subComponents: [prefix + "funcsPanel"]
    });

    var Form = new UIMaster.ui.panel
    ({
        ui: elementList[prefix + "Form"]
        ,items: [funcsPanel,okbtn,fieldPanel,actionPanel]
    });

    Form.funcsPanel=funcsPanel;

    Form.infoPanel0=infoPanel0;

    Form.nameUILabel=nameUILabel;

    Form.nameUI=nameUI;

    Form.descriptionUILabel=descriptionUILabel;

    Form.descriptionUI=descriptionUI;

    Form.typeUILabel=typeUILabel;

    Form.typeUI=typeUI;

    Form.onSaleDateUILabel=onSaleDateUILabel;

    Form.onSaleDateUI=onSaleDateUI;

    Form.saleEndDateUILabel=saleEndDateUILabel;

    Form.saleEndDateUI=saleEndDateUI;

    Form.infoPanel3=infoPanel3;

    Form.infoPanel1=infoPanel1;

    Form.photoPathUI=photoPathUI;

    Form.photoUI=photoUI;

    Form.photoUILabel=photoUILabel;

    Form.uploadFile=uploadFile;

    Form.infoPanel2=infoPanel2;

    Form.htmlDescUI=htmlDescUI;

    Form.okbtn=okbtn;

    Form.fieldPanel=fieldPanel;

    Form.funcsPanel=funcsPanel;

    Form.infoPanel0=infoPanel0;

    Form.nameUILabel=nameUILabel;

    Form.nameUI=nameUI;

    Form.descriptionUILabel=descriptionUILabel;

    Form.descriptionUI=descriptionUI;

    Form.typeUILabel=typeUILabel;

    Form.typeUI=typeUI;

    Form.onSaleDateUILabel=onSaleDateUILabel;

    Form.onSaleDateUI=onSaleDateUI;

    Form.saleEndDateUILabel=saleEndDateUILabel;

    Form.saleEndDateUI=saleEndDateUI;

    Form.infoPanel3=infoPanel3;

    Form.infoPanel1=infoPanel1;

    Form.photoPathUI=photoPathUI;

    Form.photoUI=photoUI;

    Form.photoUILabel=photoUILabel;

    Form.uploadFile=uploadFile;

    Form.infoPanel2=infoPanel2;

    Form.htmlDescUI=htmlDescUI;

    Form.actionPanel=actionPanel;

    Form.okbtn=okbtn;

    Form.user_constructor = function()
    {
        /* Construct_FIRST:org_shaolin_vogerp_productmodel_form_Product */
        /* Construct_LAST:org_shaolin_vogerp_productmodel_form_Product */
    };

    Form.Save = org_shaolin_vogerp_productmodel_form_Product_Save;

    Form.Cancel = org_shaolin_vogerp_productmodel_form_Product_Cancel;

    Form.invokeDynamicFunction = org_shaolin_vogerp_productmodel_form_Product_invokeDynamicFunction;

    Form.__entityName="org.shaolin.vogerp.productmodel.form.Product";

    Form.init();
    return Form;
};

    /* EventHandler Functions */
/* Other_Func_FIRST:org_shaolin_vogerp_productmodel_form_Product */
/* Other_Func_LAST:org_shaolin_vogerp_productmodel_form_Product */

    /* auto generated eventlistener function declaration */
    function org_shaolin_vogerp_productmodel_form_Product_Save(eventsource,event) {/* Gen_First:org_shaolin_vogerp_productmodel_form_Product_Save */

        {   
            var constraint_result = this.Form.validate();
            if (constraint_result != true && constraint_result != null) {
                return false;
            }
        }
        
        // cal ajax function. 

        UIMaster.triggerServerEvent(UIMaster.getUIID(eventsource),"saveDetail-201504121132",UIMaster.getValue(eventsource),this.__entityName);

        var UIEntity = this;
    }/* Gen_Last:org_shaolin_vogerp_productmodel_form_Product_Save */


    /* auto generated eventlistener function declaration */
    function org_shaolin_vogerp_productmodel_form_Product_Cancel(eventsource,event) {/* Gen_First:org_shaolin_vogerp_productmodel_form_Product_Cancel */

        // cal ajax function. 

        UIMaster.triggerServerEvent(UIMaster.getUIID(eventsource),"cancelDetail-201504121132",UIMaster.getValue(eventsource),this.__entityName);

        var UIEntity = this;
    }/* Gen_Last:org_shaolin_vogerp_productmodel_form_Product_Cancel */


    /* auto generated eventlistener function declaration */
    function org_shaolin_vogerp_productmodel_form_Product_invokeDynamicFunction(eventsource,event) {/* Gen_First:org_shaolin_vogerp_productmodel_form_Product_invokeDynamicFunction */

        // cal ajax function. 

        UIMaster.triggerServerEvent(UIMaster.getUIID(eventsource),event,UIMaster.getValue(eventsource),this.__entityName);

        var UIEntity = this;
    }/* Gen_Last:org_shaolin_vogerp_productmodel_form_Product_invokeDynamicFunction */



