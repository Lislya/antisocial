import Vue from 'vue'
import VueResource from 'vue-resource'
import { connect } from "./util/ws";
import App from 'pages/App.vue'

if (frontendData.profile) {
    connect();
}

Vue.use(VueResource);

new Vue({
   el: '#app',
   render: a => a(App)
});