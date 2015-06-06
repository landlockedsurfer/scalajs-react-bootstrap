# scalajs-react-bootstrap
Scala.js React Bootstrap Sample

Running `fastOptJS` in sbt and loading index.html into the browser yields the following error:

```
Uncaught TypeError: Cannot read property '__reactAutoBindMap' of undefined
```

The dependencies on react and react-bootstrap were manually added:
* React v0.13.3
* React Bootstrap v0.23.1
