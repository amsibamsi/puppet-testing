# do not replace content if already there
file {
  '/tmp/puppettest':
    ensure  => file,
    content => 'test',
    replace => false;
}
