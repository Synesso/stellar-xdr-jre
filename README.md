# Stellar XDR JRE

A cleaned up copy of sources generated by xdrgen.

## How to generate

1. Install [xdrgen](https://github.com/stellar/xdrgen) if necessary
2. Update [stellar-core](https://github.com/stellar/stellar-core/tags) to obtain the latest XDR definitions
3. Execute xdrgen in the root of this project against the stellar-core XDR definitions: 
     `xdrgen -o src/main/java/org/stellar/xdr/ -l java -n org.stellar.xdr ../stellar-core/src/xdr/*`
4. Execute "reformat code" in IntelliJ across the entire package.
5. Update the version of this project in `build.sbt` to match the stellar-core tag.