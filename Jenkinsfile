pipeline {
    environment{
        ImageName = ""
    }
    agent any
    stages {
        stage('Git pull') {
            steps {
                git branch: 'main', credentialsId: 'github-credentials', url: 'https://github.com/ronak66/DevOps-Calculator-App'
            }t
        }
        stage('Docker Build to Image') {
            steps {
                script{
                    ImageName = docker.build "ronak66/calculator-devops:latest"                    
                }
            }
        }
        stage('Push Docker Image') {
            steps {
                script{
                    docker.withRegistry('','dockerhub-credentials'){
                        ImageName.push()
                    }
                }
            }
        }
        stage('Ansible Pull Docker Image') {
            steps {
                ansiblePlaybook becomeUser: null, colorized: true, disableHostKeyChecking: true, installation: 'Ansible', inventory: 'deploy-docker/inventory', playbook: 'deploy-docker/deploy-image.yml', sudoUser: null
            }
        }
    }
}

