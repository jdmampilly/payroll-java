(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([["chunk-8d7093d2"],{2881:function(e,t,o){"use strict";o.r(t);var l=function(){var e=this,t=e.$createElement,o=e._self._c||t;return o("div",{staticClass:"main-div"},[e._m(0),o("hr"),o("h5",{staticClass:"col-left"},[o("b-badge",[e._v("Personal information")])],1),o("b-row",{staticClass:"mt-1"},[o("b-col",{staticClass:"col-left",attrs:{cols:"1",offset:"1"}},[o("label",{attrs:{for:"input-code"}},[e._v("Code:")])]),o("b-col",{attrs:{cols:"2"}},[o("b-form-input",{staticClass:"form-control form-control-sm",attrs:{id:"input-code",placeholder:"Code",readonly:!0},model:{value:e.employee.id,callback:function(t){e.$set(e.employee,"id",t)},expression:"employee.id"}})],1),o("b-col",{staticClass:"col-left",attrs:{cols:"1"}},[o("label",{attrs:{for:"input-name"}},[e._v("Name:")])]),o("b-col",{attrs:{cols:"5"}},[o("b-form-input",{staticClass:"form-control form-control-sm",attrs:{id:"empName",placeholder:"Enter your name",required:""},model:{value:e.employee.empName,callback:function(t){e.$set(e.employee,"empName",t)},expression:"employee.empName"}})],1)],1),o("b-row",{staticClass:"mt-1"},[o("b-col",{staticClass:"col-left",attrs:{cols:"1",offset:"1"}},[o("label",{attrs:{for:"input-birthDate"}},[e._v("Birth Date:")])]),o("b-col",{attrs:{cols:"2"}},[o("datepicker",{attrs:{placeholder:"Select Date",format:"dd/MM/yyyy","input-class":"form-control form-control-sm styleLine"},model:{value:e.employee.birthDate,callback:function(t){e.$set(e.employee,"birthDate",t)},expression:"employee.birthDate"}})],1),o("b-col",{staticClass:"col-left",attrs:{cols:"1"}},[o("label",{attrs:{for:"input-nationality"}},[e._v("Nationality:")])]),o("b-col",{attrs:{cols:"5"}},[o("b-form-input",{staticClass:"form-control form-control-sm",attrs:{id:"input-nationality",placeholder:"Enter your nationality"},model:{value:e.employee.nationality,callback:function(t){e.$set(e.employee,"nationality",t)},expression:"employee.nationality"}})],1)],1),o("b-row",{staticClass:"mt-1"},[o("b-col",{staticClass:"col-left",attrs:{cols:"1",offset:"1"}},[o("label",{attrs:{for:"input-passportNo"}},[e._v("Passport No.:")])]),o("b-col",{attrs:{cols:"2"}},[o("b-form-input",{staticClass:"form-control form-control-sm",attrs:{id:"input-passportNo",placeholder:"passport number"},model:{value:e.employee.passportNo,callback:function(t){e.$set(e.employee,"passportNo",t)},expression:"employee.passportNo"}})],1),o("b-col",{staticClass:"col-left",attrs:{cols:"1"}},[o("label",{attrs:{for:"input-passportIssueDate"}},[e._v("Issue Dt:")])]),o("b-col",{attrs:{cols:"2"}},[o("datepicker",{attrs:{placeholder:"Select Date",format:"dd/MM/yyyy","input-class":"form-control form-control-sm styleLine"},model:{value:e.employee.passportIssuedDate,callback:function(t){e.$set(e.employee,"passportIssuedDate",t)},expression:"employee.passportIssuedDate"}})],1),o("b-col",{staticClass:"col-left",attrs:{cols:"1"}},[o("label",{attrs:{for:"input-passportExpirtyDate"}},[e._v("Expiry Date:")])]),o("b-col",{attrs:{cols:"2"}},[o("datepicker",{attrs:{placeholder:"Select Date",format:"dd/MM/yyyy","input-class":"form-control form-control-sm styleLine"},model:{value:e.employee.passportExpiryDate,callback:function(t){e.$set(e.employee,"passportExpiryDate",t)},expression:"employee.passportExpiryDate"}})],1)],1),o("b-row",{staticClass:"mt-1"},[o("b-col",{staticClass:"col-left",attrs:{cols:"1",offset:"1"}},[o("label",{attrs:{for:"input-cprNo"}},[e._v("Cpr Number:")])]),o("b-col",{attrs:{cols:"2"}},[o("b-form-input",{staticClass:"form-control form-control-sm",attrs:{id:"input-cprNo",placeholder:"CPR no",required:""},model:{value:e.employee.cprNo,callback:function(t){e.$set(e.employee,"cprNo",t)},expression:"employee.cprNo"}})],1),o("b-col",{staticClass:"col-left",attrs:{cols:"1"}},[o("label",{attrs:{for:"input-cprIssueDate"}},[e._v("Issue Date:")])]),o("b-col",{attrs:{cols:"2"}},[o("datepicker",{attrs:{placeholder:"Select Date",format:"dd/MM/yyyy","input-class":"form-control form-control-sm styleLine"},model:{value:e.employee.cprIssuedDate,callback:function(t){e.$set(e.employee,"cprIssuedDate",t)},expression:"employee.cprIssuedDate"}})],1),o("b-col",{staticClass:"col-left",attrs:{cols:"1"}},[o("label",{attrs:{for:"input-cprExpiryDate"}},[e._v("Expiry Date:")])]),o("b-col",{attrs:{cols:"2"}},[o("datepicker",{attrs:{placeholder:"Select Date",format:"dd/MM/yyyy","input-class":"form-control form-control-sm styleLine"},model:{value:e.employee.cprExpiryDate,callback:function(t){e.$set(e.employee,"cprExpiryDate",t)},expression:"employee.cprExpiryDate"}})],1)],1),o("hr"),o("h5",{staticClass:"col-left"},[o("b-badge",[e._v("Work information")])],1),o("b-row",{staticClass:"mt-1"},[o("b-col",{staticClass:"col-left",attrs:{cols:"1",offset:"1"}},[o("label",{attrs:{for:"input-On Boarding Date"}},[e._v("Service Date:")])]),o("b-col",{attrs:{cols:"2"}},[o("datepicker",{attrs:{placeholder:"Select Date",format:"dd/MM/yyyy","input-class":"form-control form-control-sm styleLine"},model:{value:e.employee.onBoardingDate,callback:function(t){e.$set(e.employee,"onBoardingDate",t)},expression:"employee.onBoardingDate"}})],1),o("b-col",{staticClass:"col-left",attrs:{cols:"1"}},[o("label",{attrs:{for:"input-Off Boarding Date"}},[e._v("Service end:")])]),o("b-col",{attrs:{cols:"2"}},[o("datepicker",{attrs:{placeholder:"Select Date",format:"dd/MM/yyyy","input-class":"form-control form-control-sm styleLine"},model:{value:e.employee.offBoardingDate,callback:function(t){e.$set(e.employee,"offBoardingDate",t)},expression:"employee.offBoardingDate"}})],1)],1),o("b-row",{staticClass:"mt-1"},[o("b-col",{staticClass:"col-left",attrs:{cols:"1",offset:"1"}},[o("label",{attrs:{for:"profession"}},[e._v("Profession:")])]),o("b-col",{attrs:{cols:"2"}},[o("b-form-input",{staticClass:"form-control form-control-sm",attrs:{id:"profession",placeholder:"Enter employee profession"},model:{value:e.employee.profession,callback:function(t){e.$set(e.employee,"profession",t)},expression:"employee.profession"}})],1),o("b-col",{staticClass:"col-left",attrs:{cols:"1"}},[o("label",{attrs:{for:"workDesignation"}},[e._v("Designation:")])]),o("b-col",{attrs:{cols:"2"}},[o("b-form-input",{staticClass:"form-control form-control-sm",attrs:{id:"workDesignation",placeholder:"Enter employee work designation"},model:{value:e.employee.workDesignation,callback:function(t){e.$set(e.employee,"workDesignation",t)},expression:"employee.workDesignation"}})],1),o("b-col",{staticClass:"col-left",attrs:{cols:"1"}},[o("label",{attrs:{for:""}},[e._v("Department:")])]),o("b-col",{attrs:{cols:"2"}},[o("b-form-input",{staticClass:"form-control form-control-sm",attrs:{id:"",placeholder:"",required:""},model:{value:e.employee.deptCode,callback:function(t){e.$set(e.employee,"deptCode",t)},expression:"employee.deptCode"}})],1)],1),o("b-row",{staticClass:"mt-1"},[o("b-col",{staticClass:"col-left",attrs:{cols:"1",offset:"1"}},[o("label",{attrs:{for:""}},[e._v("Contract:")])]),o("b-col",{attrs:{cols:"2"}},[o("b-form-select",{staticClass:"mb-2 mr-sm-2 mb-sm-0",attrs:{id:"inline-form-custom-select-pref",options:[{text:"Choose...",value:null},"Local","Expatriate","Part timer"],value:null},model:{value:e.employee.contractType,callback:function(t){e.$set(e.employee,"contractType",t)},expression:"employee.contractType"}})],1),o("b-col",{staticClass:"col-left",attrs:{cols:"1"}},[o("label",{attrs:{for:""}},[e._v(" Status:")])]),o("b-col",{attrs:{cols:"2"}},[o("b-form-select",{staticClass:"mb-2 mr-sm-2 mb-sm-0",attrs:{id:"inline-form-custom-select-pref",options:[{text:"Choose...",value:null},"Bachelor","Family","NA"],value:null},model:{value:e.employee.passage,callback:function(t){e.$set(e.employee,"passage",t)},expression:"employee.passage"}})],1),o("b-col",{staticClass:"col-left",attrs:{cols:"1"}},[o("label",{attrs:{for:""}},[e._v("Tickets:")])]),o("b-col",{attrs:{cols:"2"}},[o("b-form-select",{staticClass:"mb-2 mr-sm-2 mb-sm-0",attrs:{id:"inline-form-custom-select-pref",options:[{text:"Choose...",value:null},"Yearly","Once in 2 years","NA"],value:null},model:{value:e.employee.ticket,callback:function(t){e.$set(e.employee,"ticket",t)},expression:"employee.ticket"}})],1)],1),o("hr"),o("h5",{staticClass:"col-left"},[o("b-badge",[e._v("Financial information")])],1),o("b-row",{staticClass:"mt-1"},[o("b-col",{staticClass:"col-left",attrs:{cols:"1",offset:"1"}},[o("label",{attrs:{for:"basicSalary"}},[e._v("Basic Salary:")])]),o("b-col",{attrs:{cols:"1"}},[o("vue-numeric",{staticClass:"\n            form-control form-control-sm\n            styleLine\n            col-right\n            group1-color\n          ",staticStyle:{"padding-right":"0px"},attrs:{placeholder:"",separator:",",precision:3},model:{value:e.employee.basicSalary,callback:function(t){e.$set(e.employee,"basicSalary",t)},expression:"employee.basicSalary"}})],1),o("b-col",{staticClass:"col-left",attrs:{cols:"1"}},[o("label",{attrs:{for:""}},[e._v("Pay Mode:")])]),o("b-col",{attrs:{cols:"1"}},[o("b-form-select",{staticClass:"mb-2 mr-sm-2 mb-sm-0",attrs:{id:"inline-form-custom-select-pref",options:[{text:"Choose...",value:null},"Cash","Cheque"],value:null},model:{value:e.employee.paymentMode,callback:function(t){e.$set(e.employee,"paymentMode",t)},expression:"employee.paymentMode"}})],1),o("b-col",{staticClass:"col-left",attrs:{cols:"1"}},[o("label",{attrs:{for:"bankCode"}},[e._v("Bank Code:")])]),o("b-col",{attrs:{cols:"1"}},[o("b-form-input",{staticClass:"form-control form-control-sm",attrs:{id:"bankCode",placeholder:""},model:{value:e.employee.bankCode,callback:function(t){e.$set(e.employee,"bankCode",t)},expression:"employee.bankCode"}})],1),o("b-col",{staticClass:"col-left",attrs:{cols:"1"}},[o("label",{attrs:{for:"acNumber"}},[e._v("Account No:")])]),o("b-col",{attrs:{cols:"2"}},[o("b-form-input",{staticClass:"form-control form-control-sm",attrs:{id:"acNumber",placeholder:""},model:{value:e.employee.acNumber,callback:function(t){e.$set(e.employee,"acNumber",t)},expression:"employee.acNumber"}})],1)],1),o("b-row",{staticClass:"mt-1"},[o("b-col",{staticClass:"col-left",attrs:{cols:"1",offset:"1"}},[o("label",{attrs:{for:"rentAllowance"}},[e._v("Rent :")])]),o("b-col",{attrs:{cols:"1"}},[o("vue-numeric",{staticClass:"\n            form-control form-control-sm\n            styleLine\n            col-right\n            group1-color\n          ",staticStyle:{"padding-right":"0px"},attrs:{placeholder:"",separator:",",precision:3},model:{value:e.employee.rentAllowance,callback:function(t){e.$set(e.employee,"rentAllowance",t)},expression:"employee.rentAllowance"}})],1),o("b-col",{staticClass:"col-left",attrs:{cols:"1"}},[o("label",{attrs:{for:"travelAllowance"}},[e._v("Travel:")])]),o("b-col",{attrs:{cols:"1"}},[o("vue-numeric",{staticClass:"\n            form-control form-control-sm\n            styleLine\n            col-right\n            group1-color\n          ",staticStyle:{"padding-right":"0px"},attrs:{placeholder:"",separator:",",precision:3},model:{value:e.employee.travelAllowance,callback:function(t){e.$set(e.employee,"travelAllowance",t)},expression:"employee.travelAllowance"}})],1),o("b-col",{staticClass:"col-left",attrs:{cols:"1"}},[o("label",{attrs:{for:"specialAllowance"}},[e._v("Special:")])]),o("b-col",{attrs:{cols:"1"}},[o("vue-numeric",{staticClass:"\n            form-control form-control-sm\n            styleLine\n            col-right\n            group1-color\n          ",staticStyle:{"padding-right":"0px"},attrs:{placeholder:"",separator:",",precision:3},model:{value:e.employee.specialAllowance,callback:function(t){e.$set(e.employee,"specialAllowance",t)},expression:"employee.specialAllowance"}})],1),o("b-col",{staticClass:"col-left",attrs:{cols:"1"}},[o("label",{attrs:{for:"otherAllowance"}},[e._v("Other:")])]),o("b-col",{attrs:{cols:"1"}},[o("vue-numeric",{staticClass:"\n            form-control form-control-sm\n            styleLine\n            col-right\n            group1-color\n          ",staticStyle:{"padding-right":"0px"},attrs:{placeholder:"",separator:",",precision:3},model:{value:e.employee.otherAllowance,callback:function(t){e.$set(e.employee,"otherAllowance",t)},expression:"employee.otherAllowance"}})],1),o("b-col",{staticClass:"col-left",attrs:{cols:"1"}},[o("label",{attrs:{for:"nightShiftAllowance"}},[e._v("Night Shift:")])]),o("b-col",{attrs:{cols:"1"}},[o("vue-numeric",{staticClass:"\n            form-control form-control-sm\n            styleLine\n            col-right\n            group1-color\n          ",staticStyle:{"padding-right":"0px"},attrs:{placeholder:"",separator:",",precision:3},model:{value:e.employee.nshAllowance,callback:function(t){e.$set(e.employee,"nshAllowance",t)},expression:"employee.nshAllowance"}})],1)],1),o("b-row",{staticClass:"mt-1"},[o("b-col",{staticClass:"col-left",attrs:{cols:"1",offset:"1"}},[o("label",{attrs:{for:"housingBankAmount"}},[e._v("H Bank:")])]),o("b-col",{attrs:{cols:"1"}},[o("vue-numeric",{staticClass:"\n            form-control form-control-sm\n            styleLine\n            col-right\n            group1-color\n          ",staticStyle:{"padding-right":"0px"},attrs:{placeholder:"",separator:",",precision:3},model:{value:e.employee.housingBankAmount,callback:function(t){e.$set(e.employee,"housingBankAmount",t)},expression:"employee.housingBankAmount"}})],1),o("b-col",{staticClass:"col-left",attrs:{cols:"1"}},[o("label",{attrs:{for:"input-gosiAmount"}},[e._v("Gosi:")])]),o("b-col",{attrs:{cols:"1"}},[o("vue-numeric",{staticClass:"\n            form-control form-control-sm\n            styleLine\n            col-right\n            group1-color\n          ",staticStyle:{"padding-right":"0px"},attrs:{placeholder:"",separator:",",precision:3},model:{value:e.employee.gosiAmount,callback:function(t){e.$set(e.employee,"gosiAmount",t)},expression:"employee.gosiAmount"}})],1)],1),o("b-row",{staticClass:"mt-2"}),o("hr"),o("h5",{staticClass:"col-left"},[o("b-badge",[e._v("Guarantee information")])],1),o("b-row",{staticClass:"mt-3"},[o("b-col",{attrs:{cols:"2",offset:"1"}},[o("b-form-checkbox",{attrs:{id:"checkbox-1",name:"telephoneGuarantee",value:"0","unchecked-value":"1"},model:{value:e.employee.telephoneGuarantee,callback:function(t){e.$set(e.employee,"telephoneGuarantee",t)},expression:"employee.telephoneGuarantee"}},[e._v("Telephone Guarantee")])],1),o("b-col",{attrs:{cols:"2"}},[o("b-form-checkbox",{attrs:{id:"checkbox-2",name:"electricityGuarantee",value:"0","unchecked-value":"1"},model:{value:e.employee.electricityGuarantee,callback:function(t){e.$set(e.employee,"electricityGuarantee",t)},expression:"employee.electricityGuarantee"}},[e._v("Electricity Guarantee")])],1),o("b-col",{attrs:{cols:"3"}},[o("b-form-checkbox",{attrs:{id:"checkbox-3",name:"externalBankLoantelephoneGuarantee",value:"0","unchecked-value":"1"},model:{value:e.employee.externalBankLoanGuarantee,callback:function(t){e.$set(e.employee,"externalBankLoanGuarantee",t)},expression:"employee.externalBankLoanGuarantee"}},[e._v("External Bank Loan Guarantee")])],1),o("b-col",{attrs:{cols:"2"}},[o("b-form-input",{attrs:{id:"bankName",placeholder:""},model:{value:e.employee.bankName,callback:function(t){e.$set(e.employee,"bankName",t)},expression:"employee.bankName"}})],1)],1),o("hr"),o("b-row",{attrs:{"align-h":"center"}},[o("b-button",{staticClass:"mr-1",attrs:{variant:"dark"},on:{click:function(t){return t.preventDefault(),e.save()}}},[e._v("Save")]),o("b-button",{staticClass:"mr-1",attrs:{variant:"outline-dark"},on:{click:function(t){e.resetVar(),e.houseKeeping()}}},[e._v("Cancel")]),o("b-button",{staticClass:"mr-1",attrs:{variant:"secondary"},on:{click:function(t){e.setEmployeeFormDisplay(),e.houseKeeping()}}},[e._v("Close")])],1)],1)},s=[function(){var e=this,t=e.$createElement,o=e._self._c||t;return o("div",{staticClass:"h-35 d-inline-block",staticStyle:{width:"100%"}},[o("h2",{staticClass:"page-head"},[e._v("Employee Master")])])}],a=o("2f62"),r=o("fa33"),c=o("d85e"),n=o.n(c),i={data:function(){return{errors:[]}},components:{Datepicker:r["a"],VueNumeric:n.a},methods:{...Object(a["b"])(["getEmployee","resetPayrollVar","setEmployeeFormDisplay","saveEmployee","updateEmployee"]),checkForm:function(e){if(console.log("checking form data"),this.errors=[],this.employee.empName||this.errors.push("Name Required."),this.employee.empName.length>40&&this.errors.push("Name should not be more than 40 chr"),this.employee.empName.length<3&&this.errors.push("Name should be at least 3 chr"),this.employee.deptCode||this.errors.push("Department Required."),this.employee.cprNo||this.errors.push("Employee CPR Required."),!this.errors.length)return!0;this.errors.unshift("Fields highlighted in yellow are required, please enter following ..")},houseKeeping(){this.errors=[]},async save(){this.checkForm(),this.errors.length?this.$toasted.show(this.errors,{theme:"bubble",position:"top-right",duration:5e3}):(0===this.employee.id?await this.saveEmployee(this.employee):await this.updateEmployee(this.employee),this.$toasted.show(this.message,{theme:"bubble",position:"top-right",duration:5e3})),this.houseKeeping()}},computed:{...Object(a["c"])(["employee","message"])}},p=i,m=(o("b293"),o("2877")),u=Object(m["a"])(p,l,s,!1,null,"cb47c11c",null);t["default"]=u.exports},b293:function(e,t,o){"use strict";o("fd70")},fd70:function(e,t,o){}}]);
//# sourceMappingURL=chunk-8d7093d2.e091309a.js.map