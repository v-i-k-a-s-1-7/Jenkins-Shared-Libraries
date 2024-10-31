def call(String url , String branch){
    echo "this is code"
    git url:"${url}", branch:"${branch}"
    echo "code cloning sucessfull"
}
