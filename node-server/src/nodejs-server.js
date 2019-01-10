var http = require('http');
var url = require("url");
var path = require('path');
// 创建server
var server = http.createServer(function (req, res) {
    // 获得请求的路径
    var pathname = url.parse(req.url).pathname;
    res.writeHead(200, {'Content-Type': 'application/json; charset=utf-8'});
    // 访问http://localhost:8000/，将会返回{"index":"欢迎来到首页"}
    if (pathname === '/') {
        res.end(JSON.stringify({"index": "Hello World!"}));
    }
    // 访问http://localhost:8000/health.json，将会返回{"status":"UP"}
    else if (pathname === '/health') {
        res.end(JSON.stringify({"status": "UP"}));
    } else if (pathname === '/hi') {
        var options = {
            host: 'localhost',
            port: 8077,
            path: '/user-service-provider/hello',
            method: 'GET',
            headers: {
                'accept': '*/*',
                'content-type': "application/json"
            }
        };
        var req = http.request(options, function (res) {
            res.on('data', function (data) {
                console.log('请求成功: ' + data);
            });
        });
        req.end();
        res.end("SUCCESS");
    }

    // 其他情况返回404
    else {
        res.end("404");
    }
});
// 创建监听，并打印日志
server.listen(8000, function () {
    console.log('listening on localhost:8000');
});
 