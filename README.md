# boyfriendbot

My girlfriend complains that I don't send her text messages often enough, so I made this program. It allows you to schedule random, doting messages to your girlfriend.


## Usage
This application uses the Twilio API to send your text messages, so you must have an account there for this program to work.
Edit the config.json file and replace the messages field with a JSON array
filled with message objects that contain the **from** phone number, **to**
phone number, and the **body** for each of the messages in your pool. Fill in the appropriate fields with your Twilio information. You will need to fill the schedule field with a string that contains a crontab. Examples of crontabs can be [found here](http://www.thegeekstuff.com/2009/06/15-practical-crontab-examples/).

Then type `lein run` to start the program.

The application will send a random text message from your provided list of messages at the times you scheduled in your config.json file.

Type `q` and `RETURN` to quit the program.

## Todos
- Better documentation with config.json examples
- Create bot to respond to messages from girlfriend with intelligent response, possibly by using a chatbot api (Cleverbot, possibly?) or creating my own

## License

The MIT License (MIT)

Copyright (c) <year> <copyright holders>

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
Do whatever you want with this.
