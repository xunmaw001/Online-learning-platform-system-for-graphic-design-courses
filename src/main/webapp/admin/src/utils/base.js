const base = {
    get() {
        return {
            url : "http://localhost:8080/ssm8s7c9/",
            name: "ssm8s7c9",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssm8s7c9/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "平面设计课程在线学习平台系统"
        } 
    }
}
export default base
