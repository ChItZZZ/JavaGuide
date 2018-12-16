idea自带的
iter
psf
fori
soutv


自定义
tr
``` java
new Thread(()->{

})
```

ctrl
```
@org.springframework.web.bind.annotation.RestController
class $entity$Controller {

    private $entity$Repository repository;

    public $entity$Controller($entity$Repository repository) {
        this.repository = repository;
    }

    @org.springframework.web.bind.annotation.GetMapping("/$uriMapping$")
    java.util.Collection<$entity$> list() {
        return repository.findAll();
    }
}
```