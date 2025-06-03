def call(String kubeconfigPath) {
    withEnv(["KUBECONFIG=${kubeconfigPath}"]) {
        sh '''
            kubectl apply -f dep.yaml
            kubectl apply -f service.yaml
        '''
    }
}

