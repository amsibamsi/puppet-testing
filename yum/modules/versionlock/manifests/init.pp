class versionlock {

  augeas {
    'versionlock':
      lens => 'yumversionlock',
      incl => '/etc/yum/pluginconf.d/versionlock.list',
      changes => [
        'set java-1.6.0-oracle-devel/version 1.6.0.33-puzzle.5.el5.centos'
      ],
  }

}
