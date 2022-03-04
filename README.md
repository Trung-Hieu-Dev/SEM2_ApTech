# [APTECH]: NHOM 3 - HUMAN RESOURCES MANAGEMENT

### Extension use in app:

- mysql-connector-java

`````bash
https://dev.mysql.com/downloads/connector/j/?os=26
`````

### Branch name table

|          Branch          |        Description         |
|:------------------------:|:--------------------------:| 
|    dev/UI/branch_name    |    use to create app UI    |
| dev/features/branch_name | use to create app features |
|    fixbug/branch_name    |  use to fixbug (if have)   |
|         updating         |          updating          |

### Before start to code remember to pull new code from main

- To pull code on <b>main</b> branch

`````bash
git pull
`````

- To pull code on <b>your branch</b>

`````bash
git pull origin main
`````

or

`````bash
git pull
`````

### How to create new branch and push to Github:

- Create new branch

````bash
git checkout -b <branch_name>
````

- Push branch to remote

`````bash
git add .
`````

`````bash
git commit -m "<branch_name>: <your_commit_message>"
`````

`````bash
git push
`````

or

`````bash
git push --set-upstream origin <branch_name>
`````

### How to merge <b>branch</b> to <b>main</b> and push to remote

`````bash
git merge <branch_name>
`````

`````bash
git push
`````

😍 Happy coding! 😍
