import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import shequfuwu from '@/views/modules/shequfuwu/list'
    import news from '@/views/modules/news/list'
    import yuangong from '@/views/modules/yuangong/list'
    import zoufangxinxi from '@/views/modules/zoufangxinxi/list'
    import shequxinxi from '@/views/modules/shequxinxi/list'
    import shequwenjian from '@/views/modules/shequwenjian/list'
    import laorenxinxi from '@/views/modules/laorenxinxi/list'
    import yonghu from '@/views/modules/yonghu/list'
    import huodongbaoming from '@/views/modules/huodongbaoming/list'
    import zoufangrenwu from '@/views/modules/zoufangrenwu/list'
    import discussshequhuodong from '@/views/modules/discussshequhuodong/list'
    import shequhuodong from '@/views/modules/shequhuodong/list'
    import config from '@/views/modules/config/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
      ,{
	path: '/shequfuwu',
        name: '社区服务',
        component: shequfuwu
      }
      ,{
	path: '/news',
        name: '社区资讯',
        component: news
      }
      ,{
	path: '/yuangong',
        name: '员工',
        component: yuangong
      }
      ,{
	path: '/zoufangxinxi',
        name: '走访信息',
        component: zoufangxinxi
      }
      ,{
	path: '/shequxinxi',
        name: '社区信息',
        component: shequxinxi
      }
      ,{
	path: '/shequwenjian',
        name: '社区文件',
        component: shequwenjian
      }
      ,{
	path: '/laorenxinxi',
        name: '老人信息',
        component: laorenxinxi
      }
      ,{
	path: '/yonghu',
        name: '用户',
        component: yonghu
      }
      ,{
	path: '/huodongbaoming',
        name: '活动报名',
        component: huodongbaoming
      }
      ,{
	path: '/zoufangrenwu',
        name: '走访任务',
        component: zoufangrenwu
      }
      ,{
	path: '/discussshequhuodong',
        name: '社区活动评论',
        component: discussshequhuodong
      }
      ,{
	path: '/shequhuodong',
        name: '社区活动',
        component: shequhuodong
      }
      ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
