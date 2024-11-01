def call( String ProjectName, String ImageTag){
    echo "this is Build"
    sh "docker build -t "${ProjectName}":"${ImageTag}" ."
}
