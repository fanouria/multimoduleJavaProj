pipeline{
    agent any 
    tools{
        maven "maven-3.6.1"
    } 
    stages{
        stage("Initial stage"){
            steps{
                git branch: 'main',
                credentialsId: 'github_credentials',
                url:"https://github.com/fanouria/multimoduleJavaProj.git"
            }
        }
        stage("Compile"){
            steps{
                echo "mvn clean compile"
            }
        }
        stage("Testing"){
            steps{
                bat "mvn test"
            }
            post{
                always{
                    junit '**/target/surefire-reports/*.xml'
                }
            }
        }
        
    }
    post{
        success{
            mail to:"fanouria.ath@gmail.com",
            subject:"SUCCESSFUL BUILD: $BUILD_TAG",
            body:"Link to JOB $BUILD_URL"
        }
        failure{
            mail to:"fanouria.ath@gmail.com",
            subject:"FAILURE BUILD: $BUILD_TAG",
            body:"Link to JOB $BUILD_URL"
        }
    }

}