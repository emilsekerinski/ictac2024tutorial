# A Formal Look at Programming

*Emil Sekerinski, November 2024*

**Training lecture presented at [ICTAC 2024](https://ictac2024.cs.ait.ac.th/)**  

This training lecture provides an introduction to the classical theory of program correctness:
- Sequential programming
- Modularization (object-oriented programming)
- Robustness (exceptions)
- Concurrency (including semaphores and message passing)

These lecture notes
- use a *visual formalism* to be programming language independent,
- explore the *algebraic structure* of programs,
- connect the theory and common programming languages with *interactive notebooks*.

The target audience is:
- students starting with formal methods or interested in strengthening their programming,
- instructors looking to teach a more rigorous approach to programming.

The lecture notes and accompanying exercises are [Jupyter](https://jupyter.org) notebooks. There are several ways to run the notebooks:

|                         | JupyterLite        | Jupyter                                     | JupyterHub                                                                                                                                          |
|:------------------------|:-------------------|:--------------------------------------------|:----------------------------------------------------------------------------------------------------------------------------------------------------|
| Installation            | no(*)              | easy(**)                                    | involved                                                                                                                                            |
| Code runs               | in browser         | locally or remotely                         | remotely                                                                                                                                  |
| Users                   | one                | one                                         | instructor and students                                                                                                                             |
| Classroom functionality | no                 | no                                          | via [nbgrader](https://nbgrader.readthedocs.io/):<br>releasing and collecting assignments<br>visible and hidden tests<br>manual and auto-grading of assignments |
| Kernel languages        | Python, JavaScript | Python, R, Julia, Haskell, ...              | Python, R, Julia, Haskell, ...                                                                                                                      |
| Shell commands          | no                 | yes                                         | yes                                                                                                                                                 |
| Other languages         | no                 | via shell any language:<br>Java, Go, C, ... | via shell any language:<br>Java, Go, C, ...                                                                                                         |                                                                                                              |

(*) Point browser to [emilsekerinski.github.io/ictac2024tutorial](https://emilsekerinski.github.io/ictac2024tutorial)  
(**) Run `pip install jupyterlab` (or `pip3` on macOS) after installing [Python](https://python.org); download `content` from [github.com/emilsekerinski/ictac2024tutorial](https://github.com/emilsekerinski/ictac2024tutorial)


Juypter has two user interfaces: (classic) Jupyter Notebook (one notebook per browser window) and JupyterLab (multiple notebooks per browser window). This tutorial uses *JupyterLite* with *JupyterLab*.

The pretty-printing programs and inserting Unicode math symbols, the JupyterLite repository is pre-configured with an [extension](https://github.com/KrunkZhou/jupyterlab-symbol-algorithm-extension). With a local JupyterLab installation, run `pip install Jupyterlab-symbol-algorithm-extension` (or `pip3` on macOS).

The lecture notes are presented as [RISE](https://rise.readthedocs.io/) slides. The slides are just a view of the lecture notes with some material left out. The JupyterLite repository is pre-configured with a [slide extension](https://github.com/deathbeds/jupyterlab-deck). To use slides with a local JupyterLab installation, run `pip install jupyterlab-rise` (or `pip3` on macOS).

Each chapter has one directory with the lecture notes and one directory with practice exercises. The exercise notebooks contain solutions that are initially hidden but can be revealed. If you intend to adopt the notebooks and would like more exercises with solutions for use with nbgrader, contact the author at [emil@mcmaster.ca](mailto:emil@mcmaster.ca).
