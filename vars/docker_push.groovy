def call(String Project, String ImageTag, String dockerhubuser){

  withCredentials([usernamePassword('credentialsId':"dockerHubCred",passwordVariable:"dockerHubPass",usernameVariable:"dockerHubUser")]){
                sh "docker login -u ${env.dockerHubUser} -p ${env.dockerHubPass} "
                sh "docker image tag notes-app:v2 ${env.dockerHubUser}/${Project}:${ImageTag}"
                sh "docker push ${env.dockerHubUser}/${Project}:${ImageTag}"
}


