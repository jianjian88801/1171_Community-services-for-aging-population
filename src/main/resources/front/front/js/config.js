
var projectName = '人口老龄化社区服务与管理平台';
/**
 * 轮播图配置
 */
var swiper = {
	// 设定轮播容器宽度，支持像素和百分比
	width: '100%',
	height: '400px',
	// hover（悬停显示）
	// always（始终显示）
	// none（始终不显示）
	arrow: 'none',
	// default（左右切换）
	// updown（上下切换）
	// fade（渐隐渐显切换）
	anim: 'default',
	// 自动切换的时间间隔
	// 默认3000
	interval: 2000,
	// 指示器位置
	// inside（容器内部）
	// outside（容器外部）
	// none（不显示）
	indicator: 'outside'
}

/**
 * 个人中心菜单
 */
var centerMenu = [{
	name: '个人中心',
	url: '../' + localStorage.getItem('userTable') + '/center.html'
}, 
{
	name: '我的收藏',
	url: '../storeup/list.html'
}
]


var indexNav = [

{
	name: '社区信息',
	url: './pages/shequxinxi/list.html'
}, 
{
	name: '社区活动',
	url: './pages/shequhuodong/list.html'
}, 
{
	name: '社区文件',
	url: './pages/shequwenjian/list.html'
}, 

{
	name: '社区资讯',
	url: './pages/news/list.html'
},
]

var adminurl =  "http://localhost:8080/springboot54r3f/admin/dist/index.html";

var cartFlag = false

var chatFlag = false




var menu = [{"backMenu":[{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"用户","menuJump":"列表","tableName":"yonghu"}],"menu":"用户管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"员工","menuJump":"列表","tableName":"yuangong"}],"menu":"员工管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"社区信息","menuJump":"列表","tableName":"shequxinxi"}],"menu":"社区信息管理"},{"child":[{"buttons":["查看","删除"],"menu":"老人信息","menuJump":"列表","tableName":"laorenxinxi"}],"menu":"老人信息管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"社区文件","menuJump":"列表","tableName":"shequwenjian"}],"menu":"社区文件管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"走访任务","menuJump":"列表","tableName":"zoufangrenwu"}],"menu":"走访任务管理"},{"child":[{"buttons":["查看","删除"],"menu":"走访信息","menuJump":"列表","tableName":"zoufangxinxi"}],"menu":"走访信息管理"},{"child":[{"buttons":["查看","删除"],"menu":"社区服务","menuJump":"列表","tableName":"shequfuwu"}],"menu":"社区服务管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"轮播图管理","tableName":"config"},{"buttons":["新增","查看","修改","删除"],"menu":"社区资讯","tableName":"news"}],"menu":"系统管理"}],"frontMenu":[{"child":[{"buttons":["查看"],"menu":"社区信息列表","menuJump":"列表","tableName":"shequxinxi"}],"menu":"社区信息模块"},{"child":[{"buttons":["查看","报名"],"menu":"社区活动列表","menuJump":"列表","tableName":"shequhuodong"}],"menu":"社区活动模块"},{"child":[{"buttons":["查看"],"menu":"社区文件列表","menuJump":"列表","tableName":"shequwenjian"}],"menu":"社区文件模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"buttons":["查看","删除"],"menu":"活动报名","menuJump":"列表","tableName":"huodongbaoming"}],"menu":"活动报名管理"},{"child":[{"buttons":["查看"],"menu":"老人信息","menuJump":"列表","tableName":"laorenxinxi"}],"menu":"老人信息管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"社区服务","menuJump":"列表","tableName":"shequfuwu"}],"menu":"社区服务管理"}],"frontMenu":[{"child":[{"buttons":["查看"],"menu":"社区信息列表","menuJump":"列表","tableName":"shequxinxi"}],"menu":"社区信息模块"},{"child":[{"buttons":["查看","报名"],"menu":"社区活动列表","menuJump":"列表","tableName":"shequhuodong"}],"menu":"社区活动模块"},{"child":[{"buttons":["查看"],"menu":"社区文件列表","menuJump":"列表","tableName":"shequwenjian"}],"menu":"社区文件模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"用户","tableName":"yonghu"},{"backMenu":[{"child":[{"buttons":["新增","查看","修改","删除","查看评论"],"menu":"社区活动","menuJump":"列表","tableName":"shequhuodong"}],"menu":"社区活动管理"},{"child":[{"buttons":["查看","删除","审核"],"menu":"活动报名","menuJump":"列表","tableName":"huodongbaoming"}],"menu":"活动报名管理"},{"child":[{"buttons":["新增","查看","修改"],"menu":"老人信息","menuJump":"列表","tableName":"laorenxinxi"}],"menu":"老人信息管理"},{"child":[{"buttons":["查看"],"menu":"走访任务","menuJump":"列表","tableName":"zoufangrenwu"}],"menu":"走访任务管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"走访信息","menuJump":"列表","tableName":"zoufangxinxi"}],"menu":"走访信息管理"},{"child":[{"buttons":["查看","删除","审核"],"menu":"社区服务","menuJump":"列表","tableName":"shequfuwu"}],"menu":"社区服务管理"}],"frontMenu":[{"child":[{"buttons":["查看"],"menu":"社区信息列表","menuJump":"列表","tableName":"shequxinxi"}],"menu":"社区信息模块"},{"child":[{"buttons":["查看","报名"],"menu":"社区活动列表","menuJump":"列表","tableName":"shequhuodong"}],"menu":"社区活动模块"},{"child":[{"buttons":["查看"],"menu":"社区文件列表","menuJump":"列表","tableName":"shequwenjian"}],"menu":"社区文件模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"员工","tableName":"yuangong"}]


var isAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].backMenu.length;j++){
                for(let k=0;k<menus[i].backMenu[j].child.length;k++){
                    if(tableName==menus[i].backMenu[j].child[k].tableName){
                        let buttons = menus[i].backMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}

var isFrontAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].frontMenu.length;j++){
                for(let k=0;k<menus[i].frontMenu[j].child.length;k++){
                    if(tableName==menus[i].frontMenu[j].child[k].tableName){
                        let buttons = menus[i].frontMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}
