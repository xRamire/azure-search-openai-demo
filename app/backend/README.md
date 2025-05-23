# Backend Directory

This directory contains the backend implementation of the RAG chat app with Azure OpenAI and Azure AI Search.

## Overview
The backend is responsible for handling API requests, managing data processing, and integrating with Azure services such as Azure OpenAI and Azure Cognitive Search. It serves as the core engine of the application.

## Key Features
- **API Endpoints**: Provides RESTful APIs for frontend communication.
- **Azure Integration**: Connects to Azure OpenAI and Azure Cognitive Search for intelligent data retrieval and processing.
- **Data Processing**: Handles data ingestion, transformation, and storage.

## Directory Structure
- `app.py`: Entry point for the backend application.
- `approaches/`: Contains different approaches for data retrieval and processing.
- `chat_history/`: Manages chat history storage and retrieval.
- `config.py`: Configuration settings for the backend.
- `core/`: Core utilities and helper functions.
- `custom_uvicorn_worker.py`: Custom Uvicorn worker for running the application.
- `decorators.py`: Common decorators used across the backend.
- `Dockerfile`: Docker configuration for containerizing the backend.
- `error.py`: Error handling utilities.
- `gunicorn.conf.py`: Gunicorn configuration for running the backend.
- `load_azd_env.py`: Script to load Azure Developer environment variables.
- `main.py`: Main application logic.
- `prepdocs.py`: Script for preparing documents for ingestion.
- `prepdocslib/`: Library for document preparation.
- `requirements.in` and `requirements.txt`: Python dependencies.

## Prerequisites
- Python 3.8 or later
- Azure account with access to Azure OpenAI and Azure Cognitive Search

## Setup
1. Install dependencies:
   ```bash
   pip install -r requirements.txt
   ```
2. Configure Azure services in `config.py`.
3. Run the backend:
   ```bash
   python app.py
   ```

## Contributing
Contributions are welcome! Please refer to the main `CONTRIBUTING.md` file in the root directory for guidelines.

## License
This project is licensed under the terms of the MIT license. See the `LICENSE` file in the root directory for details.
