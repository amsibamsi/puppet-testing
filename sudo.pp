define sudo(
  $content = ''
) {

  file {
    '/tmp/sudoers.in.d':
      ensure => directory;
    "/tmp/sudoers.in.d/$name":
      content => $content,
      notify  => Exec["sudo_install_$name"];
    '/tmp/sudoers.d':
      ensure => directory;
  }

  exec {
    "sudo_install_$name":
      command     => "/bin/false && install -m 0440 /tmp/sudoers.in.d/$name /tmp/sudoers.d/$name",
      refreshonly => true;
  }

}

sudo {
  'a':
    content => ' this should be invalid content, right?';
}
