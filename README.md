# Streams

The idea of this simple Scala application is for testing how the standard outputs streams ( std_output and std_errror) works in the command line.

## Requiriments

* sbt 1.1.4
* java 18.9

## Use

Run the following command in the terminal:

```
sbt run 1> output.log 2> error.log
```

Open another terminal without stopping the previous one and execute the following command to know if the application is ready to run:

```
tail -f output.log
```

If you see the output `numero:`, go back to the initial terminal and provide any number (i.e. 3).

Then, if you open another terminal and execute the following command:

```
tail -f error.log
```

You will be able to see just the numbers that are not multiples of the one that you provided.

