def call(String DockerHubUser, String ProjectName, String ImageTag) {
    echo "This is Build"
    sh "docker build -t ${DockerHubUser}/${ProjectName}:${ImageTag} ."
}
