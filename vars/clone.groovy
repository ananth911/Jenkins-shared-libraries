def call(String url, String branch){

   echo "this is cloning part"
               git url: "${url}" ,branch: "${branch}"
                echo "clone success"
  
}
