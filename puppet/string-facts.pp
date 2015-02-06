if $::selinux {
  notify {
    'selinux is true':
  }
}

if $::selinux == 'true' {
  notify {
    'selinux equals true':
  }
}

if $::selinux == 'false' {
  notify {
    'selinux equals false':
  }
}
