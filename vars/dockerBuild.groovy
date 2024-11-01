def call(String DockerHubUser, String ProjectName, String ImageTag){
    echo "this is Build"
    sh "docker build -t "${DockerHubUser}"/"${ProjectName}":"${ImageTag}" ."
}
