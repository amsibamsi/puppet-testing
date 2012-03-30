class a { 
  if tagged("a") {
    notice("b is tagged")
  }
  if tagged("c") {
    notice("c is tagged")
  }
}

class b {}
class c {}

include a,b
