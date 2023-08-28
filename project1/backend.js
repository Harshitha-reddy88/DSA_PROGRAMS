var mysql = require('mysql');

var con = mysql.createConnection({
  host:"localhost",
  user:"root",
  password:"P@ssw0rd",
  database: "mydb"
});


function connectDatabase(){
    con.connect(function(err) {
        if (err) throw err;
        console.log("Connected!");
      });
}
// connectDatabase()

function createDataBase(){
    con.connect(function(err) {
        if (err) throw err;
        console.log("Connected!");
        con.query("CREATE DATABASE mydb", function (err, result) {
          if (err) throw err;
             console.log("Database created");
        });
    });
}
//createDataBase()

function createTable(){
    con.connect(function(err) {
        if (err) throw err;
        console.log("Connected!");
        var sql = "CREATE TABLE customers (name VARCHAR(255))";
        con.query(sql, function (err, result) {
          if (err) throw err;
          console.log("Table created");
        });
      });
}
//createTable()

function insertTable(){
    con.connect(function(err) {
        if (err) throw err;
        console.log("Connected!");
        var sql = "INSERT INTO customers (name) VALUES ('Harshitha')";
        con.query(sql, function (err, result) {
          if (err) throw err;
          console.log("1 record inserted");
        });
      });
}
//insertTable()

function selectTable(){
    con.connect(function(err) {
        if (err) throw err;
        con.query("SELECT * FROM customers", function (err, result, fields) {
          if (err) throw err;
          console.log(result);
        });
      });
}
//selectTable()

function selectColumns(){
    con.connect(function(err) {
        if (err) throw err;
        con.query("SELECT name FROM customers", function (err, result, fields) {
          if (err) throw err;
          console.log(result);
        });
      });
}
//selectColumns()



