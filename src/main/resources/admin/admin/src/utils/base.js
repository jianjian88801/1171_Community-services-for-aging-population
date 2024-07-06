const base = {
    get() {
        return {
            url : "http://localhost:8080/springboot54r3f/",
            name: "springboot54r3f",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springboot54r3f/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "人口老龄化社区服务与管理平台"
        } 
    }
}
export default base
