# GuruMu API
Create automation testing for API. Test case:

## 🔗 Link
<p>
    <a href="https://docs.google.com/spreadsheets/d/1mGQj6NVbtYZCHcabdkA4AH5UWITxDrlY0hzvWixFoT4/edit#gid=1006319607" target="blank"><img src="https://img.shields.io/badge/-spread%20sheet-181717?style=for-the-badge&logo=microsoft-excel" /></a>
</p>

## 🔗 Git

Cara pindah branch:
```
git checkout feature_a
```

Cara membuat branch baru:
```
git branch feature_b
```


Cara commit:
- menyamakan current branch dengan main // harus di branch main
  `git pull --rebase origin main`
- how to check location branch
  `git branch`
- pindah branch
  `git checkout <branch> `
- add perubahan nya
  `git add .` // harus di branch sendiri
- commit
  `git commit -m "message"` // harus di branch sendiri
- push
  `git push origin <branch>` // harus di branch sendiri -> git origin feature/login

## :bookmark: Note
FORMAT NAMA BRANCH:

- feature/[HTTP METHOD]-[ENDPOINT] contoh:
    - `feature/login`
    - `feature/reservation`

FORMAT COMMIT MESSAGE:
- [NAMA BRANCH]: message. contoh:
    - `feature/login: Add schenario for login` 


* Convert json to json schema ? https://www.liquid-technologies.com/online-json-to-schema-converter
* Maven repository: https://mvnrepository.com/
