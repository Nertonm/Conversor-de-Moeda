# Currency Converter

This project is a simple currency converter application written in Java. It uses the ExchangeRate-API to fetch the latest exchange rates and convert between different currencies.

## Features

- Convert USD to Argentine Peso, Brazilian Real, and Colombian Peso
- Convert Argentine Peso, Brazilian Real, and Colombian Peso to USD
- Command-line interface for user interaction

## Requirements

- Java 11 or higher
- ExchangeRate-API key

## Setup

1. Clone the repository:
    ```sh
    git clone https://github.com/yourusername/Currency-Converter.git
    cd Currency-Converter
    ```

2. Set the `EXCHANGE_API_KEY` environment variable with your ExchangeRate-API key:
    ```sh
    export EXCHANGE_API_KEY=your_api_key_here
    ```

3. Build the project:
    ```sh
    ./gradlew build
    ```

## Usage

Run the application:
```sh
./gradlew run