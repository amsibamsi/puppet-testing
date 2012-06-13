class a {
  include b # need this to resolve b
  Class['a'] -> Class['b']
  notice('a')
}

class b {
  notice('b')
}

include a
