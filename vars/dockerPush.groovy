def call(String project, String imageTag){
    echo "this is pushing to Docker Hub"
    withCredentials(
        [usernamePassword(credentialsId:'DockerHubCred' ,  
        passwordVariable:"dockerHubPass", 
        usernameVariable:"dockerHubUser" )]){
    sh "docker login -u ${env.dockerHubUser} -p ${env.dockerHubPass}"
    sh "docker image tag ${project}:${imageTag} ${env.dockerHubUser}/${project}:${imageTag}"
    sh "docker push ${env.dockerHubUser}/${project}:${imageTag}"
}
