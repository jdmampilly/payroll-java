(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([["chunk-325cfcaa","chunk-c9f76f34","chunk-5890b01c","chunk-beff704e"],{"057f":function(t,e,o){var a=o("c6b6"),n=o("fc6a"),r=o("241c").f,s=o("f36a"),c="object"==typeof window&&window&&Object.getOwnPropertyNames?Object.getOwnPropertyNames(window):[],l=function(t){try{return r(t)}catch(e){return s(c)}};t.exports.f=function(t){return c&&"Window"==a(t)?l(t):r(n(t))}},"165c":function(t,e,o){"use strict";o("b005")},"1dde":function(t,e,o){var a=o("d039"),n=o("b622"),r=o("2d00"),s=n("species");t.exports=function(t){return r>=51||!a((function(){var e=[],o=e.constructor={};return o[s]=function(){return{foo:1}},1!==e[t](Boolean).foo}))}},"1fe2":function(t,e,o){},3942:function(t,e,o){"use strict";o("1fe2")},"428f":function(t,e,o){var a=o("da84");t.exports=a},"4c7b":function(t,e,o){"use strict";o.r(e);var a=function(){var t=this,e=t.$createElement,o=t._self._c||e;return o("div",[o("b-row",{staticClass:"ml-1"},[o("b-button",{on:{click:function(e){return t.addTrans()}}},[t._v("Add Transaction")])],1),o("h5",[t._v("Loan Activity")]),o("div",[o("b-table",{attrs:{"head-variant":"light",items:t.items,fields:t.fields,"current-page":t.currentPage,"per-page":t.perPage}},[o("template",{slot:"bottom-row"},[o("td",[o("h4",[o("b-badge",[t._v("Total:")])],1)]),o("td"),o("td"),o("td",{staticClass:"text-right"},[t._v(t._s(this.t1))]),o("td",{staticClass:"text-right"},[t._v(t._s(this.t2))])]),t._v(" > ")],2),o("hr"),o("b-row",[o("b-col",{staticClass:"my-1",attrs:{md:"6"}},[o("b-pagination",{staticClass:"my-0",attrs:{"total-rows":t.totalRows,"per-page":t.perPage},model:{value:t.currentPage,callback:function(e){t.currentPage=e},expression:"currentPage"}})],1)],1)],1),o("addLoan")],1)},n=[],r=o("1da1"),s=(o("96cf"),o("d3b7"),o("ed85")),c=[],l={data:function(){return{empName:"Bob Jack",items:[{empCode:"100",id:"1",transactionDate:"01/02/2015",voucherNo:"12",loanAmount:"100",amountPaid:"0",transactionDescription:"test1",bankCode:""},{empCode:"100",id:"2",transactionDate:"01/02/2015",voucherNo:"13",loanAmount:"110",amountPaid:"0",transactionDescription:"test2",bankCode:""},{empCode:"100",id:"3",transactionDate:"01/02/2015",voucherNo:"14",loanAmount:"200",amountPaid:"0",transactionDescription:"test3",bankCode:""},{empCode:"100",id:"4",transactionDate:"01/02/2015",voucherNo:"15",loanAmount:"0",amountPaid:"30",transactionDescription:"test4",bankCode:""},{empCode:"100",id:"5",transactionDate:"01/02/2015",voucherNo:"16",loanAmount:"0",amountPaid:"50",transactionDescription:"test5",bankCode:""},{empCode:"100",id:"6",transactionDate:"01/02/2015",voucherNo:"17",loanAmount:"100",amountPaid:"0",transactionDescription:"test6",bankCode:""},{empCode:"100",id:"7",transactionDate:"01/02/2015",voucherNo:"18",loanAmount:"60",amountPaid:"0",transactionDescription:"test7",bankCode:""}],fields:[{key:"id",label:"Id",sortable:!0,sortDirection:"desc"},{key:"transactionDate",label:"Transaction Date",sortable:!0,sortDirection:"desc",class:"text-left"},{key:"voucherNo",label:"Voucher No",sortable:!0,sortDirection:"desc",class:"text-left"},{key:"loanAmount",label:"Loan Amount",sortable:!0,sortDirection:"desc",class:"text-right"},{key:"amountPaid",label:"Paid",sortable:!0,sortDirection:"desc",class:"text-right"},{key:"transactionDescription",label:"Description",sortable:!0,sortDirection:"desc",class:"text-left"},{key:"bankCode",label:"Bank Code",sortable:!0,sortDirection:"desc",class:"text-left"}],currentPage:1,perPage:5,totalRows:c.length,pageOptions:[5,10,15],filter:null,modalInfo:{title:"",content:""}}},mounted:function(){this.totalRows=this.items.length},computed:{t1:function(){return this.items.reduce((function(t,e){return t+parseFloat(e.loanAmount)}),0)},t2:function(){return this.items.reduce((function(t,e){return t+parseFloat(e.amountPaid)}),0)}},components:{addLoan:s["default"]},methods:{onRowSelected:function(t){this.selected=t},addTrans:function(){var t=this;return Object(r["a"])(regeneratorRuntime.mark((function e(){return regeneratorRuntime.wrap((function(e){while(1)switch(e.prev=e.next){case 0:console.log("add trans"),t.$bvModal.show("bv-modal-addLoan");case 2:case"end":return e.stop()}}),e)})))()}}},i=l,u=(o("165c"),o("2877")),m=Object(u["a"])(i,a,n,!1,null,"b2bd42ce",null);e["default"]=m.exports},"4de4":function(t,e,o){"use strict";var a=o("23e7"),n=o("b727").filter,r=o("1dde"),s=r("filter");a({target:"Array",proto:!0,forced:!s},{filter:function(t){return n(this,t,arguments.length>1?arguments[1]:void 0)}})},5530:function(t,e,o){"use strict";o.d(e,"a",(function(){return r}));o("b64b"),o("a4d3"),o("4de4"),o("d3b7"),o("e439"),o("159b"),o("dbb4");function a(t,e,o){return e in t?Object.defineProperty(t,e,{value:o,enumerable:!0,configurable:!0,writable:!0}):t[e]=o,t}function n(t,e){var o=Object.keys(t);if(Object.getOwnPropertySymbols){var a=Object.getOwnPropertySymbols(t);e&&(a=a.filter((function(e){return Object.getOwnPropertyDescriptor(t,e).enumerable}))),o.push.apply(o,a)}return o}function r(t){for(var e=1;e<arguments.length;e++){var o=null!=arguments[e]?arguments[e]:{};e%2?n(Object(o),!0).forEach((function(e){a(t,e,o[e])})):Object.getOwnPropertyDescriptors?Object.defineProperties(t,Object.getOwnPropertyDescriptors(o)):n(Object(o)).forEach((function(e){Object.defineProperty(t,e,Object.getOwnPropertyDescriptor(o,e))}))}return t}},"746f":function(t,e,o){var a=o("428f"),n=o("1a2d"),r=o("e538"),s=o("9bf2").f;t.exports=function(t){var e=a.Symbol||(a.Symbol={});n(e,t)||s(e,t,{value:r.f(t)})}},8418:function(t,e,o){"use strict";var a=o("a04b"),n=o("9bf2"),r=o("5c6c");t.exports=function(t,e,o){var s=a(e);s in t?n.f(t,s,r(0,o)):t[s]=o}},"898e":function(t,e,o){"use strict";o("9138")},9138:function(t,e,o){},a4d3:function(t,e,o){"use strict";var a=o("23e7"),n=o("da84"),r=o("d066"),s=o("2ba4"),c=o("c65b"),l=o("e330"),i=o("c430"),u=o("83ab"),m=o("4930"),f=o("d039"),d=o("1a2d"),b=o("e8b5"),p=o("1626"),y=o("861d"),v=o("3a9b"),h=o("d9b5"),g=o("825a"),C=o("7b0b"),L=o("fc6a"),w=o("a04b"),k=o("577e"),S=o("5c6c"),O=o("7c73"),P=o("df75"),D=o("241c"),_=o("057f"),j=o("7418"),x=o("06cf"),A=o("9bf2"),I=o("d1e7"),$=o("f36a"),N=o("6eeb"),T=o("5692"),E=o("f772"),R=o("d012"),B=o("90e3"),J=o("b622"),F=o("e538"),M=o("746f"),z=o("d44e"),H=o("69f3"),Q=o("b727").forEach,V=E("hidden"),W="Symbol",q="prototype",G=J("toPrimitive"),K=H.set,U=H.getterFor(W),X=Object[q],Y=n.Symbol,Z=Y&&Y[q],tt=n.TypeError,et=n.QObject,ot=r("JSON","stringify"),at=x.f,nt=A.f,rt=_.f,st=I.f,ct=l([].push),lt=T("symbols"),it=T("op-symbols"),ut=T("string-to-symbol-registry"),mt=T("symbol-to-string-registry"),ft=T("wks"),dt=!et||!et[q]||!et[q].findChild,bt=u&&f((function(){return 7!=O(nt({},"a",{get:function(){return nt(this,"a",{value:7}).a}})).a}))?function(t,e,o){var a=at(X,e);a&&delete X[e],nt(t,e,o),a&&t!==X&&nt(X,e,a)}:nt,pt=function(t,e){var o=lt[t]=O(Z);return K(o,{type:W,tag:t,description:e}),u||(o.description=e),o},yt=function(t,e,o){t===X&&yt(it,e,o),g(t);var a=w(e);return g(o),d(lt,a)?(o.enumerable?(d(t,V)&&t[V][a]&&(t[V][a]=!1),o=O(o,{enumerable:S(0,!1)})):(d(t,V)||nt(t,V,S(1,{})),t[V][a]=!0),bt(t,a,o)):nt(t,a,o)},vt=function(t,e){g(t);var o=L(e),a=P(o).concat(wt(o));return Q(a,(function(e){u&&!c(gt,o,e)||yt(t,e,o[e])})),t},ht=function(t,e){return void 0===e?O(t):vt(O(t),e)},gt=function(t){var e=w(t),o=c(st,this,e);return!(this===X&&d(lt,e)&&!d(it,e))&&(!(o||!d(this,e)||!d(lt,e)||d(this,V)&&this[V][e])||o)},Ct=function(t,e){var o=L(t),a=w(e);if(o!==X||!d(lt,a)||d(it,a)){var n=at(o,a);return!n||!d(lt,a)||d(o,V)&&o[V][a]||(n.enumerable=!0),n}},Lt=function(t){var e=rt(L(t)),o=[];return Q(e,(function(t){d(lt,t)||d(R,t)||ct(o,t)})),o},wt=function(t){var e=t===X,o=rt(e?it:L(t)),a=[];return Q(o,(function(t){!d(lt,t)||e&&!d(X,t)||ct(a,lt[t])})),a};if(m||(Y=function(){if(v(Z,this))throw tt("Symbol is not a constructor");var t=arguments.length&&void 0!==arguments[0]?k(arguments[0]):void 0,e=B(t),o=function(t){this===X&&c(o,it,t),d(this,V)&&d(this[V],e)&&(this[V][e]=!1),bt(this,e,S(1,t))};return u&&dt&&bt(X,e,{configurable:!0,set:o}),pt(e,t)},Z=Y[q],N(Z,"toString",(function(){return U(this).tag})),N(Y,"withoutSetter",(function(t){return pt(B(t),t)})),I.f=gt,A.f=yt,x.f=Ct,D.f=_.f=Lt,j.f=wt,F.f=function(t){return pt(J(t),t)},u&&(nt(Z,"description",{configurable:!0,get:function(){return U(this).description}}),i||N(X,"propertyIsEnumerable",gt,{unsafe:!0}))),a({global:!0,wrap:!0,forced:!m,sham:!m},{Symbol:Y}),Q(P(ft),(function(t){M(t)})),a({target:W,stat:!0,forced:!m},{for:function(t){var e=k(t);if(d(ut,e))return ut[e];var o=Y(e);return ut[e]=o,mt[o]=e,o},keyFor:function(t){if(!h(t))throw tt(t+" is not a symbol");if(d(mt,t))return mt[t]},useSetter:function(){dt=!0},useSimple:function(){dt=!1}}),a({target:"Object",stat:!0,forced:!m,sham:!u},{create:ht,defineProperty:yt,defineProperties:vt,getOwnPropertyDescriptor:Ct}),a({target:"Object",stat:!0,forced:!m},{getOwnPropertyNames:Lt,getOwnPropertySymbols:wt}),a({target:"Object",stat:!0,forced:f((function(){j.f(1)}))},{getOwnPropertySymbols:function(t){return j.f(C(t))}}),ot){var kt=!m||f((function(){var t=Y();return"[null]"!=ot([t])||"{}"!=ot({a:t})||"{}"!=ot(Object(t))}));a({target:"JSON",stat:!0,forced:kt},{stringify:function(t,e,o){var a=$(arguments),n=e;if((y(e)||void 0!==t)&&!h(t))return b(e)||(e=function(t,e){if(p(n)&&(e=c(n,this,t,e)),!h(e))return e}),a[1]=e,s(ot,null,a)}})}if(!Z[G]){var St=Z.valueOf;N(Z,G,(function(t){return c(St,this)}))}z(Y,W),R[V]=!0},b005:function(t,e,o){},b64b:function(t,e,o){var a=o("23e7"),n=o("7b0b"),r=o("df75"),s=o("d039"),c=s((function(){r(1)}));a({target:"Object",stat:!0,forced:c},{keys:function(t){return r(n(t))}})},bb31:function(t,e,o){"use strict";o.r(e);var a=function(){var t=this,e=t.$createElement,o=t._self._c||e;return o("div",{staticClass:"main-div"},[o("b-row",{staticClass:"mt-2"},[o("b-col",{staticClass:"col-left",attrs:{cols:"2"}},[o("label",[t._v("Employee Loan Summary")])]),o("b-col",{staticClass:"col-left",attrs:{cols:"2",offset:"6"}},[o("label",[t._v("Payroll Summary")])])],1),o("b-row",{staticClass:"mt-2"},[o("b-col",{staticClass:"col-left",attrs:{cols:"2"}},[t._v("Total Loans:")]),o("b-col",{staticClass:"col-right",attrs:{cols:"2"}},[o("b-form-input",{staticClass:"col-right",attrs:{type:"number",readonly:!0},model:{value:t.empLoanSummary.totalLoans,callback:function(e){t.$set(t.empLoanSummary,"totalLoans",e)},expression:"empLoanSummary.totalLoans"}})],1),o("b-col",{staticClass:"col-left",attrs:{cols:"2"}},[t._v("Loan Installment")]),o("b-col",{staticClass:"col-right",attrs:{cols:"2"}},[o("b-form-input",{staticClass:"col-right",attrs:{type:"number",readonly:!0},model:{value:t.empLoanSummary.loanInstallment,callback:function(e){t.$set(t.empLoanSummary,"loanInstallment",e)},expression:"empLoanSummary.loanInstallment"}})],1),o("b-col",{staticClass:"col-left",attrs:{cols:"2"}},[t._v("Indeminity")]),o("b-col",{staticClass:"col-right",attrs:{cols:"2"}},[o("b-form-input",{staticClass:"col-right",attrs:{type:"number",readonly:!0},model:{value:t.empLoanSummary.indeminity,callback:function(e){t.$set(t.empLoanSummary,"indeminity",e)},expression:"empLoanSummary.indeminity"}})],1)],1),o("b-row",{staticClass:"mt-2"},[o("b-col",{staticClass:"col-left",attrs:{cols:"2"}},[t._v("Total Paid")]),o("b-col",{staticClass:"col-right",attrs:{cols:"2"}},[o("b-form-input",{staticClass:"col-right",attrs:{type:"number",readonly:!0},model:{value:t.empLoanSummary.totalPaid,callback:function(e){t.$set(t.empLoanSummary,"totalPaid",e)},expression:"empLoanSummary.totalPaid"}})],1),o("b-col",{staticClass:"col-left",attrs:{cols:"2"}},[t._v("Additional Installment")]),o("b-col",{attrs:{cols:"2"}},[o("b-form-input",{staticClass:"col-right",attrs:{type:"number",id:"input-additionalInstallment"},model:{value:t.empLoanSummary.additionalInstallment,callback:function(e){t.$set(t.empLoanSummary,"additionalInstallment",e)},expression:"empLoanSummary.additionalInstallment"}})],1),o("b-col",{staticClass:"col-left",attrs:{cols:"2"}},[t._v("Basic Salary")]),o("b-col",{staticClass:"col-right",attrs:{cols:"2"}},[o("b-form-input",{staticClass:"col-right",attrs:{type:"number",readonly:!0},model:{value:t.empLoanSummary.basicSalary,callback:function(e){t.$set(t.empLoanSummary,"basicSalary",e)},expression:"empLoanSummary.basicSalary"}})],1)],1),o("b-row",{staticClass:"mt-1"},[o("b-col",{staticClass:"col-left",attrs:{cols:"2"}},[t._v("Last transaction Date")]),o("b-col",{staticClass:"col-left",attrs:{cols:"2"}},[o("b-form-input",{staticClass:"col-right",attrs:{readonly:!0},model:{value:t.empLoanSummary.lastTransactionDate,callback:function(e){t.$set(t.empLoanSummary,"lastTransactionDate",e)},expression:"empLoanSummary.lastTransactionDate"}})],1),o("b-col",{staticClass:"col-left",attrs:{cols:"2"}},[t._v("Total Installment")]),o("b-col",{staticClass:"col-right",attrs:{cols:"2"}},[o("b-form-input",{staticClass:"col-right",attrs:{type:"number",readonly:!0},model:{value:t.empLoanSummary.totalInstallment,callback:function(e){t.$set(t.empLoanSummary,"totalInstallment",e)},expression:"empLoanSummary.totalInstallment"}})],1)],1)],1)},n=[],r=o("5530"),s=o("2f62"),c={data:function(){return{indeminity:"5500",basicSalary:"1800"}},computed:Object(r["a"])({},Object(s["c"])(["empLoanSummary"])),methods:{},mounted:function(){console.log("mounted loan summary")}},l=c,i=(o("898e"),o("2877")),u=Object(i["a"])(l,a,n,!1,null,"a787c9f6",null);e["default"]=u.exports},dbb4:function(t,e,o){var a=o("23e7"),n=o("83ab"),r=o("56ef"),s=o("fc6a"),c=o("06cf"),l=o("8418");a({target:"Object",stat:!0,sham:!n},{getOwnPropertyDescriptors:function(t){var e,o,a=s(t),n=c.f,i=r(a),u={},m=0;while(i.length>m)o=n(a,e=i[m++]),void 0!==o&&l(u,e,o);return u}})},e439:function(t,e,o){var a=o("23e7"),n=o("d039"),r=o("fc6a"),s=o("06cf").f,c=o("83ab"),l=n((function(){s(1)})),i=!c||l;a({target:"Object",stat:!0,forced:i,sham:!c},{getOwnPropertyDescriptor:function(t,e){return s(r(t),e)}})},e538:function(t,e,o){var a=o("b622");e.f=a},ed85:function(t,e,o){"use strict";o.r(e);var a=function(){var t=this,e=t.$createElement,o=t._self._c||e;return o("div",[o("b-modal",{attrs:{id:"bv-modal-addLoan",size:"xl","hide-header-close":"","hide-footer":""}},[o("H4",[t._v("Add Loan")]),o("div",{staticClass:"main-div "},[o("hr"),o("b-row",{staticClass:"mt-2"},[o("b-col",{staticClass:"col-left",attrs:{cols:"2",offset:"1"}},[o("label",{attrs:{for:"input-code"}},[t._v("Trn. Id:")])]),o("b-col",{staticClass:"col-left",attrs:{cols:"2"}},[t._v(t._s(t.employeeLoan.trnId))])],1),o("b-row",{staticClass:"mt-2"},[o("b-col",{staticClass:"col-left",attrs:{cols:"2",offset:"1"}},[o("label",{attrs:{for:"input-code"}},[t._v("Code:")])]),o("b-col",{attrs:{cols:"2"}},[o("b-form-input",{attrs:{id:"input-code",placeholder:"Code"},model:{value:t.employeeLoan.empCode,callback:function(e){t.$set(t.employeeLoan,"empCode",e)},expression:"employeeLoan.empCode"}})],1),o("b-col",{staticClass:"col-left",attrs:{cols:"5"}},[t._v(t._s(t.employeeLoan.empName))])],1),o("b-row",{staticClass:"mt-2"},[o("b-col",{staticClass:"col-left",attrs:{cols:"2",offset:"1"}},[o("label",{attrs:{for:"input-drAmount"}},[t._v("Dr. Amount:")])]),o("b-col",{attrs:{cols:"2"}},[o("b-form-input",{staticClass:"col-right",attrs:{id:"input-drAmount",placeholder:"Debit Amount"},model:{value:t.employeeLoan.drAmount,callback:function(e){t.$set(t.employeeLoan,"drAmount",e)},expression:"employeeLoan.drAmount"}})],1),o("b-col",{attrs:{cols:"2"}},[o("label",{attrs:{for:"input-crAmount"}},[t._v("Cr. Amount:")])]),o("b-col",{attrs:{cols:"2"}},[o("b-form-input",{staticClass:"col-right",attrs:{id:"input-crAmount",placeholder:"Credit Amount"},model:{value:t.employeeLoan.crAmount,callback:function(e){t.$set(t.employeeLoan,"crAmount",e)},expression:"employeeLoan.crAmount"}})],1)],1),o("b-row",{staticClass:"mt-1"},[o("b-col",{staticClass:"col-left",attrs:{cols:"2",offset:"1"}},[o("label",{attrs:{for:"input-description"}},[t._v("Description:")])]),o("b-col",{staticClass:"col-left",attrs:{cols:"6"}},[o("b-form-input",{attrs:{id:"input-description",placeholder:"description"},model:{value:t.employeeLoan.description,callback:function(e){t.$set(t.employeeLoan,"description",e)},expression:"employeeLoan.description"}})],1)],1),o("b-row",{staticClass:"mt-1"},[o("b-col",{staticClass:"col-left",attrs:{cols:"2",offset:"1"}},[o("label",{attrs:{for:"input-bankCode"}},[t._v("Bank Code:")])]),o("b-col",{staticClass:"col-left",attrs:{cols:"2"}},[o("b-form-input",{attrs:{id:"input-bankCode",placeholder:"bank code"},model:{value:t.employeeLoan.bankCode,callback:function(e){t.$set(t.employeeLoan,"bankCode",e)},expression:"employeeLoan.bankCode"}})],1)],1),o("b-row",{staticClass:"mt-3"},[o("b-col",{attrs:{cols:"1",offset:"3"}},[o("b-button",{on:{click:function(e){return t.closeModal()}}},[t._v("Submit")])],1),o("b-col",{attrs:{cols:"1"}},[o("b-button",{on:{click:function(e){return t.closeModal()}}},[t._v("Cancel")])],1)],1),o("br")],1),o("div",{staticClass:"form-background"},[o("hr"),o("loanSummary"),o("hr")],1),o("hr")],1)],1)},n=[],r=o("5530"),s=o("bb31"),c=o("2f62"),l={data:function(){return{}},components:{loanSummary:s["default"]},computed:Object(r["a"])({},Object(c["c"])(["employeeLoan"])),methods:Object(r["a"])(Object(r["a"])({},Object(c["b"])(["saveLoanTransaction"])),{},{closeModal:function(){this.$root.$emit("bv::hide::modal","bv-modal-addLoan","#btnShow")}})},i=l,u=(o("3942"),o("2877")),m=Object(u["a"])(i,a,n,!1,null,"307a1ab5",null);e["default"]=m.exports}}]);
//# sourceMappingURL=chunk-325cfcaa.4d5e86e1.js.map