(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([["chunk-6a623d60"],{"0278":function(t,s,e){"use strict";e("9398")},"6bf9":function(t,s,e){"use strict";e.r(s);var a=function(){var t=this,s=t.$createElement,e=t._self._c||s;return e("div",{staticClass:"main-div"},[e("b-row",{staticClass:"mt-1"},[e("b-col",{staticClass:"col-left",attrs:{cols:"1"}},[e("label",{attrs:{for:"input-id"}},[t._v("Id:")])]),e("b-col",{attrs:{cols:"2"}},[e("b-form-input",{staticClass:"form-control form-control-sm",attrs:{id:"input-id",placeholder:"Id",readonly:!0},model:{value:t.sample.id,callback:function(s){t.$set(t.sample,"id",s)},expression:"sample.id"}})],1)],1),e("b-row",{staticClass:"mt-1"},[e("b-col",{staticClass:"col-left",attrs:{cols:"1"}},[e("label",{attrs:{for:"input-select"}},[t._v("Select:")])]),e("b-col",{attrs:{cols:"1"}},[e("b-form-select",{staticClass:"form-control-sm styleLine",attrs:{tabindex:"1",options:t.optSample,required:""},model:{value:t.sample.selectId,callback:function(s){t.$set(t.sample,"selectId",s)},expression:"sample.selectId"}})],1)],1),e("b-row",{staticClass:"mt-1"},[e("b-col",{staticClass:"col-left",attrs:{cols:"1"}},[e("label",{attrs:{for:"input-date"}},[t._v("Date:")])]),e("b-col",{attrs:{cols:"2"}},[e("datepicker",{attrs:{placeholder:"Select Date",format:"dd/MM/yyyy","input-class":"form-control form-control-sm styleLine"},model:{value:t.sample.date,callback:function(s){t.$set(t.sample,"date",s)},expression:"sample.date"}})],1)],1),e("b-row",{staticClass:"mt-1"},[e("b-col",{staticClass:"col-left",attrs:{cols:"1"}},[e("label",{attrs:{for:"input-Number"}},[t._v("Number/Numeric:")])]),e("b-col",{staticStyle:{"padding-left":"13px","padding-right":"1"},attrs:{cols:"1"}},[[e("vue-numeric",{staticClass:"form-control form-control-sm styleLine col-right",staticStyle:{"padding-left":"0px"},attrs:{tabindex:"74",placeholder:"",separator:",",precision:3},model:{value:t.sample.number,callback:function(s){t.$set(t.sample,"number",s)},expression:"sample.number"}})]],2),e("b-row",{staticClass:"mt-1"},[e("b-col",{staticClass:"col-left",attrs:{cols:"1"}},[e("label",{attrs:{for:"total"}},[t._v("Total:")])]),e("b-col",{attrs:{cols:"1"}},[e("p",{staticClass:"\n            text-right\n            calculated-value\n            form-control form-control-sm\n            styleLine\n            col-right\n          "},[t._v(" "+t._s(t._f("formatter")(t.total))+" ")])])],1)],1),e("b-row",{staticClass:"mt-1"},[e("b-col",{attrs:{cols:"2"}},[e("b-form-checkbox",{attrs:{id:"checkbox-1",name:"checkbox-1",value:"accepted","unchecked-value":"not_accepted",switch:""},model:{value:t.sample.status,callback:function(s){t.$set(t.sample,"status",s)},expression:"sample.status"}},[t._v(" I accept the terms and use ")])],1)],1),e("b-row",{staticClass:"mt-1"},[e("b-col",{attrs:{cols:"2"}},[e("b-button",{staticClass:"button-style",attrs:{variant:"primary"},on:{click:t.toggleBusy}},[t._v("Toggle Busy State")])],1)],1),e("b-row",{staticClass:"mt-1"},[e("b-col",{staticClass:"col-left",attrs:{cols:"1"}},[e("label",{attrs:{for:"datepicker"}},[t._v("Date:")])]),e("b-col",{attrs:{cols:"2"}},[e("datepicker",{attrs:{placeholder:"Select Date",format:"dd/MM/yyyy","input-class":"form-control form-control-sm styleLine"},model:{value:t.sample.date,callback:function(s){t.$set(t.sample,"date",s)},expression:"sample.date"}})],1)],1),e("b-row",{staticClass:"mt-1"},[e("b-col",{attrs:{cols:"1"}},[e("b-badge",{attrs:{variant:"primary"}},[t._v("Primary")])],1)],1),e("div",{directives:[{name:"show",rawName:"v-show",value:t.isBusy,expression:"isBusy"}]},[[e("div",{staticClass:"text-center text-danger my-2"},[e("b-spinner",{staticClass:"align-middle"}),t._m(0)],1)]],2),e("b-row",{staticClass:"mt-1"},[e("b-col",{attrs:{cols:"2"}},[e("b-button",{directives:[{name:"b-toggle",rawName:"v-b-toggle.sidebar-1",modifiers:{"sidebar-1":!0}}]},[t._v("Toggle Sidebar")])],1)],1),e("div",[e("b-sidebar",{attrs:{id:"sidebar-1",title:"Sidebar",shadow:""}},[e("div",{staticClass:"px-3 py-2"},[e("p",[t._v(" Cras mattis consectetur purus sit amet fermentum. Cras justo odio, dapibus ac facilisis in, egestas eget quam. Morbi leo risus, porta ac consectetur ac, vestibulum at eros. ")])])])],1)],1)},l=[function(){var t=this,s=t.$createElement,e=t._self._c||s;return e("h4",[e("strong",[t._v("Please wait...")])])}],o=e("fa33"),r=e("d85e"),c=e.n(r),i=e("2f62"),n={props:["myprop"],data(){return{isBusy:!1,sample:{},t1:0,t2:0,optSample:[{text:"test1,Sample 1",value:"1"},{text:"test2,Sample 2",value:"2"}],searchListFields:[{key:"id",label:"User Id",class:"text-left",sortable:!0,sortDirection:"desc"}]}},created(){},mounted(){},components:{Datepicker:o["a"],VueNumeric:c.a},filters:{formatter:function(t){return isNaN(t)?0:new Intl.NumberFormat(void 0,{minimumFractionDigits:3}).format(t)}},watch:{},computed:{...Object(i["c"])([]),total:function(){return parseFloat(this.t1||0)+parseFloat(this.t2||0)}},methods:{...Object(i["b"])([]),toggleBusy(){this.isBusy=!this.isBusy}}},m=n,d=(e("0278"),e("2877")),u=Object(d["a"])(m,a,l,!1,null,"2ac5271e",null);s["default"]=u.exports},9398:function(t,s,e){}}]);
//# sourceMappingURL=chunk-6a623d60.c4b66368.js.map