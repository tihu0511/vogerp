/* null */
/* auto generated constructor */
function org_shaolin_vogerp_commonmodel_form_PersonalInfo(json)
{
    var prefix = (typeof(json) == "string") ? json : json.prefix; 
    var idUI = new UIMaster.ui.hidden
    ({
        ui: elementList[prefix + "idUI"]
    });

    var firstNameUILabel = new UIMaster.ui.label
    ({
        ui: elementList[prefix + "firstNameUILabel"]
    });

    var firstNameUI = new UIMaster.ui.textfield
    ({
        ui: elementList[prefix + "firstNameUI"]
    });

    var lastNameUILabel = new UIMaster.ui.label
    ({
        ui: elementList[prefix + "lastNameUILabel"]
    });

    var lastNameUI = new UIMaster.ui.textfield
    ({
        ui: elementList[prefix + "lastNameUI"]
    });

    var typeUILabel = new UIMaster.ui.label
    ({
        ui: elementList[prefix + "typeUILabel"]
    });

    var genderUILabel = new UIMaster.ui.label
    ({
        ui: elementList[prefix + "genderUILabel"]
    });

    var genderUI = new UIMaster.ui.combobox
    ({
        ui: elementList[prefix + "genderUI"]
    });

    var marriedUILabel = new UIMaster.ui.label
    ({
        ui: elementList[prefix + "marriedUILabel"]
    });

    var marriedUI = new UIMaster.ui.checkbox
    ({
        ui: elementList[prefix + "marriedUI"]
    });

    var identityCardIdUILabel = new UIMaster.ui.label
    ({
        ui: elementList[prefix + "identityCardIdUILabel"]
    });

    var identityCardIdUI = new UIMaster.ui.textfield
    ({
        ui: elementList[prefix + "identityCardIdUI"]
    });

    var discriptionUILabel = new UIMaster.ui.label
    ({
        ui: elementList[prefix + "discriptionUILabel"]
    });

    var discriptionUI = new UIMaster.ui.textfield
    ({
        ui: elementList[prefix + "discriptionUI"]
    });

    var birthdayUILabel = new UIMaster.ui.label
    ({
        ui: elementList[prefix + "birthdayUILabel"]
    });

    var birthdayUI = new UIMaster.ui.calendar
    ({
        ui: elementList[prefix + "birthdayUI"]
    });

    var languageUILabel = new UIMaster.ui.label
    ({
        ui: elementList[prefix + "languageUILabel"]
    });

    var languageUI = new UIMaster.ui.combobox
    ({
        ui: elementList[prefix + "languageUI"]
    });

    var educationUILabel = new UIMaster.ui.label
    ({
        ui: elementList[prefix + "educationUILabel"]
    });

    var educationUI = new UIMaster.ui.combobox
    ({
        ui: elementList[prefix + "educationUI"]
    });

    var majorUILabel = new UIMaster.ui.label
    ({
        ui: elementList[prefix + "majorUILabel"]
    });

    var majorUI = new UIMaster.ui.textfield
    ({
        ui: elementList[prefix + "majorUI"]
    });

    var commentUILabel = new UIMaster.ui.label
    ({
        ui: elementList[prefix + "commentUILabel"]
    });

    var commentUI = new UIMaster.ui.textfield
    ({
        ui: elementList[prefix + "commentUI"]
    });

    var okbtn = new UIMaster.ui.button
    ({
        ui: elementList[prefix + "okbtn"]
    });

    var cancelbtn = new UIMaster.ui.button
    ({
        ui: elementList[prefix + "cancelbtn"]
    });

    var typeUI = new org_shaolin_vogerp_commonmodel_form_CEHierarchyWithCombox({"prefix":prefix + "typeUI."});

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
        ,subComponents: [prefix + "idUI",prefix + "firstNameUILabel",prefix + "firstNameUI",prefix + "lastNameUILabel",prefix + "lastNameUI",prefix + "typeUILabel",prefix + "typeUI",prefix + "genderUILabel",prefix + "genderUI",prefix + "marriedUILabel",prefix + "marriedUI",prefix + "identityCardIdUILabel",prefix + "identityCardIdUI",prefix + "discriptionUILabel",prefix + "discriptionUI",prefix + "birthdayUILabel",prefix + "birthdayUI",prefix + "languageUILabel",prefix + "languageUI",prefix + "educationUILabel",prefix + "educationUI",prefix + "majorUILabel",prefix + "majorUI",prefix + "commentUILabel",prefix + "commentUI"]
    });

    var Form = new UIMaster.ui.panel
    ({
        ui: elementList[prefix + "Form"]
        ,items: [idUI,firstNameUILabel,firstNameUI,lastNameUILabel,lastNameUI,typeUILabel,genderUILabel,genderUI,marriedUILabel,marriedUI,identityCardIdUILabel,identityCardIdUI,discriptionUILabel,discriptionUI,birthdayUILabel,birthdayUI,languageUILabel,languageUI,educationUILabel,educationUI,majorUILabel,majorUI,commentUILabel,commentUI,okbtn,cancelbtn,typeUI,fieldPanel,actionPanel]
    });

    Form.idUI=idUI;

    Form.firstNameUILabel=firstNameUILabel;

    Form.firstNameUI=firstNameUI;

    Form.lastNameUILabel=lastNameUILabel;

    Form.lastNameUI=lastNameUI;

    Form.typeUILabel=typeUILabel;

    Form.genderUILabel=genderUILabel;

    Form.genderUI=genderUI;

    Form.marriedUILabel=marriedUILabel;

    Form.marriedUI=marriedUI;

    Form.identityCardIdUILabel=identityCardIdUILabel;

    Form.identityCardIdUI=identityCardIdUI;

    Form.discriptionUILabel=discriptionUILabel;

    Form.discriptionUI=discriptionUI;

    Form.birthdayUILabel=birthdayUILabel;

    Form.birthdayUI=birthdayUI;

    Form.languageUILabel=languageUILabel;

    Form.languageUI=languageUI;

    Form.educationUILabel=educationUILabel;

    Form.educationUI=educationUI;

    Form.majorUILabel=majorUILabel;

    Form.majorUI=majorUI;

    Form.commentUILabel=commentUILabel;

    Form.commentUI=commentUI;

    Form.okbtn=okbtn;

    Form.cancelbtn=cancelbtn;

    Form.typeUI=typeUI;

    Form.fieldPanel=fieldPanel;

    Form.idUI=idUI;

    Form.firstNameUILabel=firstNameUILabel;

    Form.firstNameUI=firstNameUI;

    Form.lastNameUILabel=lastNameUILabel;

    Form.lastNameUI=lastNameUI;

    Form.typeUILabel=typeUILabel;

    Form.typeUI=typeUI;

    Form.genderUILabel=genderUILabel;

    Form.genderUI=genderUI;

    Form.marriedUILabel=marriedUILabel;

    Form.marriedUI=marriedUI;

    Form.identityCardIdUILabel=identityCardIdUILabel;

    Form.identityCardIdUI=identityCardIdUI;

    Form.discriptionUILabel=discriptionUILabel;

    Form.discriptionUI=discriptionUI;

    Form.birthdayUILabel=birthdayUILabel;

    Form.birthdayUI=birthdayUI;

    Form.languageUILabel=languageUILabel;

    Form.languageUI=languageUI;

    Form.educationUILabel=educationUILabel;

    Form.educationUI=educationUI;

    Form.majorUILabel=majorUILabel;

    Form.majorUI=majorUI;

    Form.commentUILabel=commentUILabel;

    Form.commentUI=commentUI;

    Form.actionPanel=actionPanel;

    Form.okbtn=okbtn;

    Form.cancelbtn=cancelbtn;

    Form.user_constructor = function()
    {
        /* Construct_FIRST:org_shaolin_vogerp_commonmodel_form_PersonalInfo */
        /* Construct_LAST:org_shaolin_vogerp_commonmodel_form_PersonalInfo */
    };

    Form.Save = org_shaolin_vogerp_commonmodel_form_PersonalInfo_Save;

    Form.Cancel = org_shaolin_vogerp_commonmodel_form_PersonalInfo_Cancel;

    Form.invokeDynamicFunction = org_shaolin_vogerp_commonmodel_form_PersonalInfo_invokeDynamicFunction;

    Form.__entityName="org.shaolin.vogerp.commonmodel.form.PersonalInfo";

    Form.init();
    return Form;
};

    /* EventHandler Functions */
/* Other_Func_FIRST:org_shaolin_vogerp_commonmodel_form_PersonalInfo */
/* Other_Func_LAST:org_shaolin_vogerp_commonmodel_form_PersonalInfo */

    /* auto generated eventlistener function declaration */
    function org_shaolin_vogerp_commonmodel_form_PersonalInfo_Save(eventsource,event) {/* Gen_First:org_shaolin_vogerp_commonmodel_form_PersonalInfo_Save */

        {   
            var constraint_result = this.Form.validate();
            if (constraint_result != true && constraint_result != null) {
                return false;
            }
        }
        
        // cal ajax function. 

        UIMaster.triggerServerEvent(UIMaster.getUIID(eventsource),"saveDetail-2117220046",UIMaster.getValue(eventsource),this.__entityName);

        var UIEntity = this;
    }/* Gen_Last:org_shaolin_vogerp_commonmodel_form_PersonalInfo_Save */


    /* auto generated eventlistener function declaration */
    function org_shaolin_vogerp_commonmodel_form_PersonalInfo_Cancel(eventsource,event) {/* Gen_First:org_shaolin_vogerp_commonmodel_form_PersonalInfo_Cancel */

        // cal ajax function. 

        UIMaster.triggerServerEvent(UIMaster.getUIID(eventsource),"cancelDetail99521939",UIMaster.getValue(eventsource),this.__entityName);

        var UIEntity = this;
    }/* Gen_Last:org_shaolin_vogerp_commonmodel_form_PersonalInfo_Cancel */


    /* auto generated eventlistener function declaration */
    function org_shaolin_vogerp_commonmodel_form_PersonalInfo_invokeDynamicFunction(eventsource,event) {/* Gen_First:org_shaolin_vogerp_commonmodel_form_PersonalInfo_invokeDynamicFunction */

        // cal ajax function. 

        UIMaster.triggerServerEvent(UIMaster.getUIID(eventsource),event,UIMaster.getValue(eventsource),this.__entityName);

        var UIEntity = this;
    }/* Gen_Last:org_shaolin_vogerp_commonmodel_form_PersonalInfo_invokeDynamicFunction */



