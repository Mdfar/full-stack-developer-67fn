provider "aws" { region = "us-east-1" }

resource "aws_eks_cluster" "staqlt_cluster" { name = "staqlt-enterprise-cluster" role_arn = aws_iam_role.eks_role.arn

vpc_config { subnet_ids = ["subnet-12345", "subnet-67890"] } }

resource "aws_lambda_function" "data_processor" { filename = "lambda_function_payload.zip" function_name = "staqlt_event_handler" role = aws_iam_role.lambda_role.arn handler = "index.handler" runtime = "nodejs18.x" }