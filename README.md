# gitPractice
Git Practice 11-11-2016

#create branch
go to that branch from where we need to create new branch and use below command:

1. creating branch locally:
git checkout -b <new-branch-name>
e.g
git push origie release/0.0.1
this will create new branch at local
now the second step to move this local branch to remote repository

2. pushing loacl branch to remote:
git push --set-upstream origin <new-branch-name>
e.g  git push --set-upstream origin release/0.0.1


#Listing of branch
3. git branch -a
