(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([["chunk-277bb14f"],{"132e":function(e,t,r){},"40f0":function(e,t,r){"use strict";r.r(t);var a=function(){var e=this,t=e.$createElement,r=e._self._c||t;return r("div",{staticClass:"main-div"},[r("br"),r("b-row",[r("div",{staticClass:"center"},[r("h5",{staticClass:"center"},[e._v("Reports list")])])]),r("br"),r("b-row",[r("b-col",{attrs:{cols:"8"}},[r("b-row",[r("div",{staticClass:"table-div"},[r("b-container",{attrs:{fluid:""}},[r("b-table",{staticClass:"table table-bordered table-sm",attrs:{striped:"","thead-class":"thead-light",selectable:"","select-mode":e.selectMode,"selected-variant":"warning",items:e.reportItems,fields:e.fields,"current-page":e.currentPage,"per-page":e.perPage,filter:e.filter,"sort-by":e.sortBy,"sort-desc":e.sortDesc,"sort-direction":e.sortDirection,hover:!0},on:{"row-selected":e.onRowSelected,"update:sortBy":function(t){e.sortBy=t},"update:sort-by":function(t){e.sortBy=t},"update:sortDesc":function(t){e.sortDesc=t},"update:sort-desc":function(t){e.sortDesc=t}},scopedSlots:e._u([{key:"cell(selected)",fn:function(t){var a=t.rowSelected;return[a?[r("span",{staticClass:"sr-only"},[e._v("Selected")])]:[r("span",{staticClass:"sr-only"},[e._v("Not selected")])]]}}])}),r("b-pagination",{staticClass:"my-0",attrs:{"total-rows":e.totalRows,"per-page":e.perPage,size:"sm"},model:{value:e.currentPage,callback:function(t){e.currentPage=t},expression:"currentPage"}})],1)],1)])],1),r("b-col",{attrs:{cols:"4"}},[r("b-row",[r("b-form-row",{directives:[{name:"show",rawName:"v-show",value:e.dateParameter,expression:"dateParameter"}]},[r("b-col",{attrs:{cols:"4"}},[r("b-form-group",{attrs:{label:"From Date","label-for":"rptFromDate","label-align":"left"}},[r("b-input-group",[r("datepicker",{attrs:{placeholder:"Select Date",format:"dd/MM/yyyy","input-class":"form-control form-control-sm styleLine"},model:{value:e.rptFromDate,callback:function(t){e.rptFromDate=t},expression:"rptFromDate"}})],1)],1)],1),r("b-col",{attrs:{cols:"6"}},[r("b-form-group",{attrs:{label:"To Date","label-for":"rptToDate","label-align":"left"}},[r("b-input-group",[r("datepicker",{attrs:{placeholder:"Select Date",format:"dd/MM/yyyy","input-class":"form-control form-control-sm styleLine"},model:{value:e.rptToDate,callback:function(t){e.rptToDate=t},expression:"rptToDate"}})],1)],1)],1)],1),r("b-form-row",{directives:[{name:"show",rawName:"v-show",value:e.divisionParameter,expression:"divisionParameter"}]},[r("b-col",{attrs:{cols:"6"}},[r("b-form-group",{staticClass:"mb-1 textBoxWidth",attrs:{label:"Division","label-for":"divCode","label-align":"left"}},[r("b-input-group",[r("b-form-select",{staticClass:"form-control form-control-sm styleLine mb-1 textBoxWidth",staticStyle:{"padding-left":"1px"},model:{value:e.divCode,callback:function(t){e.divCode=t},expression:"divCode"}},[r("option",{attrs:{value:"101"}},[e._v("PRESS")]),r("option",{attrs:{value:"102"}},[e._v("PUBLISHING")])])],1)],1)],1),r("b-col",{staticClass:"col-left",attrs:{cols:"6"}})],1),r("b-form-row",{directives:[{name:"show",rawName:"v-show",value:e.employeeParameter,expression:"employeeParameter"}]},[r("b-col",{attrs:{cols:"6"}},[r("b-form-group",{staticClass:"mb-1 textBoxWidth",attrs:{label:"Employee","label-for":"empCode","label-align":"left"}},[r("b-input-group",[r("b-form-input",{staticClass:"form-control form-control-sm styleLine",staticStyle:{"padding-left":"5px"},attrs:{id:"empCode"},model:{value:e.empCode,callback:function(t){e.empCode=t},expression:"empCode"}})],1)],1)],1)],1),r("b-form-row",{directives:[{name:"show",rawName:"v-show",value:e.payrollHistoryParameter,expression:"payrollHistoryParameter"}]},[r("b-col",{attrs:{cols:"6"}},[r("b-form-group",{staticClass:"mb-1 textBoxWidth",attrs:{label:"Payroll Month","label-for":"payrollMonth","label-align":"left"}},[r("b-input-group",[r("b-form-input",{staticClass:"form-control form-control-sm styleLine",staticStyle:{"padding-left":"5px"},attrs:{id:"payrollMonth"},model:{value:e.payrollMonth,callback:function(t){e.payrollMonth=t},expression:"payrollMonth"}})],1)],1)],1)],1),r("b-form-row",{directives:[{name:"show",rawName:"v-show",value:e.payrollHistoryParameter,expression:"payrollHistoryParameter"}]},[r("b-col",{attrs:{cols:"6"}},[r("b-form-group",{staticClass:"mb-1 textBoxWidth",attrs:{label:"Payroll Year","label-for":"payrollYear","label-align":"left"}},[r("b-input-group",[r("b-form-input",{staticClass:"form-control form-control-sm styleLine",staticStyle:{"padding-left":"5px"},attrs:{id:"payrollYear"},model:{value:e.payrollYear,callback:function(t){e.payrollYear=t},expression:"payrollYear"}})],1)],1)],1)],1)],1),r("b-row",[r("b-col",{attrs:{cols:"4"}},[r("b-button",{attrs:{variant:"secondary"},on:{click:function(t){return e.runReport()}}},[e._v(" "+e._s("Show Report"))])],1)],1)],1)],1),r("hr"),r("div",{directives:[{name:"show",rawName:"v-show",value:e.isBusy,expression:"isBusy"}]},[[r("div",{staticClass:"text-center text-danger my-2"},[r("b-spinner",{staticClass:"align-middle"}),e._m(0)],1)]],2)],1)},o=[function(){var e=this,t=e.$createElement,r=e._self._c||t;return r("h4",[r("strong",[e._v("Please wait...")])])}],s=r("bc3a"),l=r.n(s),i=r("2f62"),n=r("fa33");const p=[];var c={data(){return{isBusy:!1,directorateList:[],errors:[],selectMode:"single",selected:[],selectedReport:"",rptFromDate:"",rptToDate:"",reportItems:[],dateParameter:!1,deptCode:"",divisionCode:"",divCode:101,empCode:0,department:{},departmentList:[],departmentParameter:!1,divisionParameter:!1,employeeParameter:!1,payrollHistoryParameter:!1,payrollYear:0,payrollMonth:0,tRows:0,selectedValue:null,searchDept:{attr1:{name:"id",label:"Department Code"},attr2:{name:"departmentName",label:"Department Name"},attr3:{name:"divisionName",label:"Division Name"}},fields:[{key:"reportId",label:"Report Id",sortable:!0,sortDirection:"desc",class:"text-left"},{key:"reportDescription",label:"Report Description",sortable:!0,sortDirection:"desc",class:"text-left",tdClass:"col-width-300"}],currentPage:1,perPage:10,totalRows:p.length,pageOptions:[5,10,15],sortBy:null,sortDesc:!1,sortDirection:"asc",filter:null}},computed:{...Object(i["c"])([])},components:{Datepicker:n["a"]},mounted(){this.getReportList()},methods:{validateDepartmentCode(){this.fetchDepartmentCode(this.deptCode)},async getReportList(){const e="http://localhost:8080/payroll/api/v1/reports";await l.a.get(e,{headers:{"Content-Type":"application/json"}}).then(e=>{this.reportItems=e.data,this.totalRows=this.reportItems.length}).catch(e=>{console.log("Error "+e.response)})},onFiltered(e){this.totalRows=e.length,this.currentPage=1},getCurrentPage:function(e){},reSetParameterDisplay(){this.dateParameter=!1,this.departmentParameter=!1,this.employeeParameter=!1,this.divisionParameter=!1,this.payrollHistoryParameter=!1},fetchDepartmentList(){const e="http://localhost:8080/payroll/api/v1/departmentView";fetch(e).then(e=>e.json()).then(e=>{this.departmentList=e,this.tRows=this.departmentList.length}).catch(e=>console.error(e))},fetchDepartmentCode(e){this.errors=[];const t="http://localhost:8080/payroll/api/v1/department/"+e;fetch(t).then(e=>e.json()).then(e=>{this.department=e,this.deptCode=this.department.id,this.divisionCode=this.department.divisionCode}).catch(e=>{alert(e)})},onRowSelected(e){if(this.selectedReport=e[0].reportName,"undefined"!==typeof e[0])switch(this.selectedReport){case"prs1":this.reSetParameterDisplay();break;case"prs1_division":this.reSetParameterDisplay(),this.divisionParameter=!0;break;case"prs_department_analysis":this.reSetParameterDisplay();break;case"llo":this.reSetParameterDisplay();break;case"pslip-i":this.reSetParameterDisplay(),this.employeeParameter=!0;break;case"pslip-all":this.reSetParameterDisplay();break;case"pslipHistory-i":this.reSetParameterDisplay(),this.employeeParameter=!0,this.payrollHistoryParameter=!0;break;case"emp_salary_increment":this.reSetParameterDisplay(),this.dateParameter=!0;break;case"emp_salary_increment_i":this.reSetParameterDisplay(),this.employeeParameter=!0;break;case"emp_in_service":this.reSetParameterDisplay();break;case"emp_joined_currentyear":this.reSetParameterDisplay(),this.dateParameter=!0;break;case"emp_leftservice":this.reSetParameterDisplay();break;case"emp_leftservice_currentyear":this.reSetParameterDisplay(),this.dateParameter=!0;break;default:break}},checkParameter(e){switch(this.errors=[],e){case"XXCAS003":this.rptTenderNo||this.errors.push("Tender No");break;case"XXCAS004":break;default:break}if(!this.errors.length)return!0;this.errors.unshift("Report parameters are required, please enter following ")},formatDate(e){var t=e.getMonth()+1;return e.getFullYear()+"-"+t+"-"+e.getDate()},runReport:function(){this.isBusy=!this.isBusy;const e=this.selectedReport;console.log("selected report:"+e);let t="",r="";if(this.errors.length)alert(this.errors);else switch(e){case"prs1":window.open("http://aak-payroll/ReportServer?/"+e+"&rs:Command=Render&rs:format=PDF");break;case"prs_department_analysis":console.log(e),window.open("http://aak-payroll/ReportServer?/"+e+"&rs:Command=Render&rs:format=PDF");break;case"prs1_division":window.open(`http://aak-payroll/ReportServer?/${e}&rs:Command=Render&rs:format=PDF&divCode=${this.divCode}`);break;case"llo":window.open("http://aak-payroll/ReportServer?/"+e+"&rs:Command=Render&rs:format=PDF");break;case"llo-new":window.open("http://aak-payroll/ReportServer?/"+e+"&rs:Command=Render&rs:format=PDF");break;case"pslip-i":window.open(`http://aak-payroll/ReportServer?/${e}&rs:Command=Render&rs:format=PDF&empCode=${this.empCode}`);break;case"pslip-all":window.open("http://aak-payroll/ReportServer?/"+e+"&rs:Command=Render&rs:format=PDF");break;case"pslipHistory-i":window.open(`http://aak-payroll/ReportServer?/${e}&rs:Command=Render&rs:format=PDF&empCode=${this.empCode}&trnMonth=${this.payrollMonth}&trnYear=${this.payrollYear}`);break;case"emp_in_service":window.open("http://aak-payroll/ReportServer?/"+e+"&rs:Command=Render&rs:format=PDF");break;case"emp_joined_currentyear":t=this.formatDate(this.rptFromDate),r=this.formatDate(this.rptToDate),window.open(`http://aak-payroll/ReportServer?/${e}&rs:Command=Render&rs:format=PDF&fmDate=${t}&toDate=${r}`);break;case"emp_leftservice":window.open("http://aak-payroll/ReportServer?/"+e+"&rs:Command=Render&rs:format=PDF");break;case"emp_leftservice_currentyear":t=this.formatDate(this.rptFromDate),r=this.formatDate(this.rptToDate),window.open(`http://aak-payroll/ReportServer?/${e}&rs:Command=Render&rs:format=PDF&fmDate=${t}&toDate=${r}`);break;case"emp_salary_increment":t=this.formatDate(this.rptFromDate),r=this.formatDate(this.rptToDate),window.open(`http://aak-payroll/ReportServer?/${e}&rs:Command=Render&rs:format=PDF&fmDate=${t}&toDate=${r}`);break;case"emp_salary_increment_i":window.open(`http://aak-payroll/ReportServer?/${e}&rs:Command=Render&rs:format=PDF&empCode=${this.empCode}`);break}this.isBusy=!this.isBusy}}},m=c,d=(r("5a74"),r("2877")),h=Object(d["a"])(m,a,o,!1,null,"34badd4b",null);t["default"]=h.exports},"5a74":function(e,t,r){"use strict";r("132e")}}]);
//# sourceMappingURL=chunk-277bb14f.376f0dd6.js.map