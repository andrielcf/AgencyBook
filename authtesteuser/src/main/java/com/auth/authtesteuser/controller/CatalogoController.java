import com.auth.authtesteuser.entity.Livro;



@RestController
@RequestMapping("/catalogo")
public class CatalogoController {

    @Autowired
    private CatalogoService catalogoService;

    

    @PostMapping("/{catalogoId}/livros")
    public ResponseEntity<Livro> adicionarLivro(@PathVariable Long catalogoId, @RequestBody Livro livro) {
        Livro novoLivro = catalogoService.adicionarLivro(catalogoId, livro);
        return new ResponseEntity<>(novoLivro, HttpStatus.CREATED);
    }

    @GetMapping("/{catalogoId}/livros")
    public ResponseEntity<List<Livro>> listarLivros(@PathVariable Long catalogoId) {
        List<Livro> livros = catalogoService.listarLivros(catalogoId);
        return new ResponseEntity<>(livros, HttpStatus.OK);
    }

    @PutMapping("/livros/{id}")
    public ResponseEntity<Livro> editarLivro(@PathVariable Long id, @RequestBody Livro livroAtualizado) {
        Livro livro = catalogoService.editarLivro(id, livroAtualizado);
        return new ResponseEntity<>(livro, HttpStatus.OK);
    }

    @DeleteMapping("/livros/{id}")
    public ResponseEntity<Void> excluirLivro(@PathVariable Long id) {
        catalogoService.excluirLivro(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}